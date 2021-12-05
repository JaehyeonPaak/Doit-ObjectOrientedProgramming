package Chapter6.Exercise.Q7;

public class CardTest {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();
        cardCompany.createCard("Bank1");
        cardCompany.createCard("Bank2");
        cardCompany.createCard("Bank3");
        cardCompany.getCardsInfo();
    }
}
