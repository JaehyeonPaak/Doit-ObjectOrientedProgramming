package Chapter6.Exercise.Q6;

import java.util.ArrayList;

public class CardTest {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Bank1", "Red"));
        cards.add(new Card("Bank2", "Black"));
        cards.add(new Card("Bank3", "White"));
        for(Card c: cards) {
            c.getCardInfo();
        }
    }
}
