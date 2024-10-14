public abstract class Dessert implements Edible {
  int calories;
  String[] ingredients = new String[10];

  public Dessert(int startcalories, String[] startingredients){
    calories = startcalories;
    ingredients = startingredients;
  }
  public abstract void goBad();

  @Override
  public int getCalories(){
    return calories;
  }
}