package metier;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardPileTest {

    @Test
    public void constructorSizeCardsTest(){
        CardPile pile = new CardPile();
        int expected = 54;
        assertEquals(expected, pile.getCards().size());
    }

    @Test
    public void drawTest1(){
        CardPile pile = new CardPile();
        Card expected = new Card(Value.One, Color.Green);
        assertEquals(expected, pile.draw());
    }

    @Test
    public void drawTest2(){
        CardPile pile = new CardPile();
        pile.draw();
        Card expected = new Card(Value.One, Color.Blue);
        assertEquals(expected, pile.draw());
    }

    @Test
    public void drawTest3(){
        CardPile pile = new CardPile();
        for (int i = 0; i < 54; i++) { // vider la pile de carte
            pile.draw();
        }
        assertEquals(null, pile.draw());
    }


}
