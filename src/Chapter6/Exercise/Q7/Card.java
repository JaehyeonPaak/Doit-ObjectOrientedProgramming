package Chapter6.Exercise.Q7;

public class Card {
    public String bankName;
    public static int cardNumber = 1000;
    public int uniqueNumber;

    public Card(String bankName) {
        this.bankName = bankName;
        cardNumber++;
        this.uniqueNumber = cardNumber;
    }

    public void getCardInfo() {
        System.out.println(bankName + ", " + uniqueNumber);
    }
}
