public class Marshmallow extends Dessert{
  public String color;
  public boolean isStale;

  public Marshmallow (int marshcalories, String[] marshingredients, String marshcolor){
    super(marshcalories, marshingredients);
    color = marshcolor;
  }

  @Override
  public void goBad(){
    isStale = true;
  }
}