public class Main {
    public static void main(String[] args) {
        int score = 100;
        int transaction = 1100;
        int balance = score + transaction;
        if (transaction > 1000) {
            int bonus = transaction / 100;
            int balanceNew = bonus + balance;
            System.out.println("bonus = " + bonus + " rub");
            System.out.println("balans = " + balanceNew + " rub");
        } else {
            System.out.println("bonus 0 rub");
            System.out.println("balans=" + balance + "rub");
        }
    }
}
