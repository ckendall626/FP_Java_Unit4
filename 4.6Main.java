import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Pokemon[] pkmnList = new Pokemon[3];
    pkmnList[0] = new Litten(50, "Whiskers", 10, "Ember");
    pkmnList[1] = new Toracat(120, "William Shakespeare", 30, "Fire Fang");
    pkmnList[2] = new Incineroar(180, "C+ tier", 30, "Throat Chop");
System.out.println(((Litten)pkmnList[0]).Speak());
    System.out.println(((Toracat)pkmnList[1]).Speak());
    System.out.println(((Incineroar)pkmnList[2]).Speak());
  }
}