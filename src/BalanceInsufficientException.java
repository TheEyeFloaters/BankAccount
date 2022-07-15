public class BalanceInsufficientException extends Exception{
    String massage ;

    public BalanceInsufficientException(String massage){
        this.massage = massage;
    }

    public String getMassage(){
        return this.massage;
    }
}
