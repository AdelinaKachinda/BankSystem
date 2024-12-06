import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankGUI extends JFrame {
    private BankSystem bankSystem;

    public BankGUI() {
        bankSystem = new BankSystem();
        initializeGUI();
    }

    private void initializeGUI() {
        setTitle("Bank System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        JLabel lblAccount = new JLabel("Account Number:");
        lblAccount.setBounds(20, 20, 120, 25);
        panel.add(lblAccount);

        JTextField txtAccount = new JTextField();
        txtAccount.setBounds(150, 20, 200, 25);
        panel.add(txtAccount);

        JLabel lblAmount = new JLabel("Amount:");
        lblAmount.setBounds(20, 60, 120, 25);
        panel.add(lblAmount);

        JTextField txtAmount = new JTextField();
        txtAmount.setBounds(150, 60, 200, 25);
        panel.add(txtAmount);

        JButton btnDeposit = new JButton("Deposit");
        btnDeposit.setBounds(20, 100, 100, 25);
        panel.add(btnDeposit);

        JButton btnWithdraw = new JButton("Withdraw");
        btnWithdraw.setBounds(140, 100, 100, 25);
        panel.add(btnWithdraw);

        JButton btnCheckBalance = new JButton("Check Balance");
        btnCheckBalance.setBounds(260, 100, 120, 25);
        panel.add(btnCheckBalance);

        JTextArea txtFeedback = new JTextArea();
        txtFeedback.setBounds(20, 150, 360, 100);
        txtFeedback.setEditable(false);
        panel.add(txtFeedback);

        btnDeposit.addActionListener(e -> {
            String accountNumber = txtAccount.getText();
            double amount;
            try {
                amount = Double.parseDouble(txtAmount.getText());
                Account account = bankSystem.getAccount(accountNumber);
                account.deposit(amount);
                txtFeedback.setText("Deposit successful. Current balance: " + account.getBalance());
            } catch (NumberFormatException ex) {
                txtFeedback.setText("Invalid amount entered.");
            } catch (IllegalArgumentException ex) {
                txtFeedback.setText(ex.getMessage());
            }
        });

        btnWithdraw.addActionListener(e -> {
            String accountNumber = txtAccount.getText();
            double amount;
            try {
                amount = Double.parseDouble(txtAmount.getText());
                Account account = bankSystem.getAccount(accountNumber);
                account.withdraw(amount);
                txtFeedback.setText("Withdrawal successful. Current balance: " + account.getBalance());
            } catch (NumberFormatException ex) {
                txtFeedback.setText("Invalid amount entered.");
            } catch (IllegalArgumentException ex) {
                txtFeedback.setText(ex.getMessage());
            }
        });

        btnCheckBalance.addActionListener(e -> {
            String accountNumber = txtAccount.getText();
            Account account = bankSystem.getAccount(accountNumber);
            txtFeedback.setText("Account Number: " + account.getAccountNumber() +
                    "\nCurrent Balance: " + account.getBalance());
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new BankGUI();
    }
}