public class Card {

    private int cardID;
    private int value;
    private boolean isFaceUp;
    private String location;

    public Card(int cardID, int value, boolean isFaceUp, String location){
        this.cardID = cardID;
        this.value = value;
        this.isFaceUp = isFaceUp;
        this.location = location;
    }

}
