package metier;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void testToString(){
        Card card = new Card(Value.One, Color.Blue);
        String expected = "Card{value=One, color=Blue}";
        assertEquals(expected, card.toString());
    }

}
