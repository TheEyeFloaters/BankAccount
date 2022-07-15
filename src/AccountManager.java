public class AccountManager {
    double walletBalance;
    public double getWalletBalance(){
        return walletBalance;
    }
    public void deposit(double amount){
        this.walletBalance = getWalletBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficientException {

        if (walletBalance>0) {
            if (walletBalance >= amount) {
                walletBalance = getWalletBalance() - amount;
            } else {
                throw new BalanceInsufficientException("Your balance is insufficient. Please try a different amount\n");
            }
        }
        else {
            throw new BalanceInsufficientException("Your balance is : 0 ");
        }
    }
}
