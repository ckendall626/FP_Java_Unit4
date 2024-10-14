public class WordGame extends Game {
  public String answer;

  public WordGame(String gameName, String startAnswer) {
    super(gameName);
    answer = startAnswer;
  }

  public void setScore(int newScore) {
    score = newScore;
  }

  public String getAnswer() {
    return answer;
  }
}