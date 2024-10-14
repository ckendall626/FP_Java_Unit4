class Main {
  public static void main(String[] args) {
    WordGame scrabble = new WordGame("scrabble", "42");
    System.out.println("The game is: " + scrabble.name);
    scrabble.score = 10;
    System.out.println("The score is: " + scrabble.getScore());
    Contact c = new Contact("equity");
    System.out.println("The game is: " + c.name);
    System.out.println("The answer is: " + c.getAnswer());

  }
}