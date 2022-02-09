/**
 *
 * @author Kmylho https://linktr.ee/Kmylho
 */
package taller_1;

public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
