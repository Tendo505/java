/**
 * @(#)AccountCaller.java
 *
 *
 * @author
 * @version 1.00 2026/3/1
 */

import javax.swing.JOptionPane;

public class AccountCaller {
    public static void main(String[] args) {

        //create two account objects with default values
        Account acc1 = new Account();
        Account acc2 = new Account();

        //input values for account 1
        String input1 = JOptionPane.showInputDialog("Enter ID for Account 1:");
        int id1 = Integer.parseInt(input1);
        acc1.setId(id1);

        String input2 = JOptionPane.showInputDialog("Enter Account Holder Name for Account 1:");
        acc1.setAccHolderName(input2);

        String input3 = JOptionPane.showInputDialog("Enter Balance for Account 1:");
        double bal1 = Double.parseDouble(input3);
        acc1.setBalance(bal1);

        String input4 = JOptionPane.showInputDialog("Enter Annual Interest Rate for Account 1:");
        double rate1 = Double.parseDouble(input4);
        acc1.setAnnualInterestRate(rate1);

        //withdraw / deposit for account 1
        String choice1 = JOptionPane.showInputDialog("Account 1 - Enter 1 to Withdraw or 0 to Deposit:");
        int c1 = Integer.parseInt(choice1);
        if (c1 == 1) {
            String input5 = JOptionPane.showInputDialog("Enter amount to withdraw for Account 1:");
            double withdraw1 = Double.parseDouble(input5);
            acc1.Withdraw(withdraw1);
        } else {
            String input5 = JOptionPane.showInputDialog("Enter amount to deposit for Account 1:");
            double deposit1 = Double.parseDouble(input5);
            acc1.Deposit(deposit1);
        }

        //input values for account 2
        String input6 = JOptionPane.showInputDialog("Enter ID for Account 2:");
        int id2 = Integer.parseInt(input6);
        acc2.setId(id2);

        String input7 = JOptionPane.showInputDialog("Enter Account Holder Name for Account 2:");
        acc2.setAccHolderName(input7);

        String input8 = JOptionPane.showInputDialog("Enter Balance for Account 2:");
        double bal2 = Double.parseDouble(input8);
        acc2.setBalance(bal2);

        String input9 = JOptionPane.showInputDialog("Enter Annual Interest Rate for Account 2:");
        double rate2 = Double.parseDouble(input9);
        acc2.setAnnualInterestRate(rate2);

        //withdraw / deposit for account 2
        String choice2 = JOptionPane.showInputDialog("Account 2 - Enter 1 to Withdraw or 0 to Deposit:");
        int c2 = Integer.parseInt(choice2);
        if (c2 == 1) {
            String input10 = JOptionPane.showInputDialog("Enter amount to withdraw for Account 2:");
            double withdraw2 = Double.parseDouble(input10);
            acc2.Withdraw(withdraw2);
        } else {
            String input10 = JOptionPane.showInputDialog("Enter amount to deposit for Account 2:");
            double deposit2 = Double.parseDouble(input10);
            acc2.Deposit(deposit2);
        }

        //display results both account
        String results = "\tAccount Summary\n\n" +
                "\tAccount 1\n" +
                "ID: " + acc1.getId() + "\n" +
                "Account Holder: " + acc1.getAccHolderName() + "\n" +
                "Annual Interest Rate: " + acc1.getAnnualInterestRate() + "\n" +
                "Latest Balance (after interest): " + (acc1.getBalance() + acc1.getMonthlyInterest()) + "\n\n" +
                "\tAccount 2\n" +
                "ID: " + acc2.getId() + "\n" +
                "Account Holder: " + acc2.getAccHolderName() + "\n" +
                "Annual Interest Rate: " + acc2.getAnnualInterestRate() + "\n" +
                "Latest Balance (after interest): " + (acc2.getBalance() + acc2.getMonthlyInterest());

        JOptionPane.showMessageDialog(null, results);
    }
}