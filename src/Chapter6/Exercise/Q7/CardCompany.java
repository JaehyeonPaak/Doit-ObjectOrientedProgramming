package Chapter6.Exercise.Q7;

import java.util.ArrayList;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private CardCompany() {}
    public static CardCompany getInstance() {
        return instance;
    }

    ArrayList<Card> cards = new ArrayList<Card>();

    public void createCard(String bankName) {
        cards.add(new Card(bankName));
    }

    public void getCardsInfo() {
        for(Card c: cards) {
            c.getCardInfo();
        }
    }
}
