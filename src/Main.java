public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int depositAmount = 3500;
        int totalAccount;
        if(depositAmount >= 1000) {
            totalAccount = clientAccount + depositAmount + depositAmount/100;
        } else {
            totalAccount = clientAccount + depositAmount;
        }
        System.out.println(totalAccount);

    }
}
