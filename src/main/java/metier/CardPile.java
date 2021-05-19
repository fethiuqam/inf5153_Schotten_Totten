package metier;

import java.util.ArrayList;
import java.util.List;

public class CardPile {

    private List<Card> cards;

    public CardPile() {
        this.cards = new ArrayList<>();
        for (Value value: Value.values()) {
            for (Color color : Color.values()) {
                cards.add(new Card(value, color));
            }
        }
    }

    public List<Card> getCards(){
        return new ArrayList<>(cards); // copie superficielle (Card immuable)
    }

    public Card draw(){
        Card card = null;
        if (!cards.isEmpty()){
            card = cards.get(0);
            cards.remove(0);
        }
        return card;
    }

    private void shuffle(){
        // todo
    }
}
