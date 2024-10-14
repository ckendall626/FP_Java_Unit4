class Main {
  public static void main(String[] args) {

    //When the equals and hashCode method are implemented correctly, both the same reference and same value variables should return true for both comparisons
    Card testCard = new Card(11, 3);

    System.out.println("Same reference");
    Card sameRefCard = testCard;
    System.out.println(testCard.equals(sameRefCard));
    System.out.println(testCard.hashCode() == sameRefCard.hashCode());

    System.out.println("Null reference");
    Card[] nullCardArr = new Card[1];
    System.out.println(testCard.equals(nullCardArr[0]));

    System.out.println("Same value");
    Card sameValCard = new Card(11,3);
    System.out.println(testCard.equals(sameValCard));
    System.out.println(testCard.hashCode() == sameValCard.hashCode());

    System.out.println("Different value");
    Card diffValCard = new Card(12, 3);
    System.out.println(testCard.equals(diffValCard));
    System.out.println(testCard.hashCode() == diffValCard.hashCode());
  }
}