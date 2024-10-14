public class Game {
  public String name;
  public int score;

  public Game(String gameName) {
    name = gameName;
  }

  public void announce() {
    System.out.println("This game is " + name);
  }

  public int getScore() {
    return score;
  }
}