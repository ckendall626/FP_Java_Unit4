public class Card {

    // Kinds of ranks
    public final int rank;
    public final int suit;

    public final static int ACE = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    
    // DIAMONDS, CLUBS, HEARTS, SPADES (in order of value, starting at 1)

    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

     public Card (int startRank, int startSuit) {
      if (startRank >= 1 && startRank <= 13) {
        rank = startRank;
      } else {
        System.out.println ("Invalid value");
        throw new RuntimeException();
      }
      if (startSuit >= 1 && startSuit <= 4) {
        suit = startSuit;
      } else {
        System.out.println ("Invalid value");
        throw new RuntimeException();
      }
    }
    
  
    public String rankToString() {
        if (rank == 1) {
            return "Ace";
        } else if (rank == 2) {
            return "Deuce";
        } else if (rank == 3) {
            return "Three";
        } else if (rank == 4) {
            return "Four";
        } else if (rank == 5) {
            return "Five";
        } else if (rank == 6) {
            return "Six";
        } else if (rank == 7) {
            return "Seven";
        } else if (rank == 8) {
            return "Eight";
        } else if (rank == 9) {
            return "Nine";
        } else if (rank == 10) {
            return "Ten";
        } else if (rank == 11) {
            return "Jack";
        } else if (rank == 12) {
            return "Queen";
        } else if (rank == 13) {
            return "King";
        } else {
     
            return null;
        }    
    }
    
    public String suitToString() {
      if (suit == 1) {
        return "Diamond";
      } else if (suit ==2) {
        return "Club";
      } else if (suit == 3) {
        return "Heart";
      } else if (suit == 4) {
        return "Spade" ;
      } else {
        return null;
      }
    }

  public boolean equals(Object otherObj){
    if (this == otherObj){
      return true;
    }
    if (otherObj == null){
      return false;
    }
    if (getClass() != otherObj.getClass()){
      return false;
    }
    Card otherCard = (Card) otherObj;
    return rankToString().equals(otherCard.rankToString()) && suitToString().equals(otherCard.suitToString());
}
  @Override
  public int hashCode(){
    return java.util.Objects.hash(rank, suit);
  }
}
