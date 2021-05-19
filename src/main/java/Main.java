import metier.Card;
import metier.Color;
import metier.Value;

public class Main {

    public static void main(String[] args) {
        Card card = new Card(Value.One, Color.Blue);
        System.out.println(card);
    }

}
