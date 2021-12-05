package Chapter6.Exercise.Q6;

public class Card {
    public String bankName;
    public String color;
    public static int cardNumber = 1000;
    public int uniqueNumber;

    public Card(String bankName, String color) {
        this.bankName = bankName;
        this.color = color;
        cardNumber++;
        this.uniqueNumber = cardNumber;
    }

    public void getCardInfo() {
        System.out.println(bankName + ", " + color + ", " + uniqueNumber);
    }
}
