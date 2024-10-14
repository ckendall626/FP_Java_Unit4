public class Animal {
  private int age;
  private int weight;

  public Animal(int startAge) {
    age = startAge;
  }
  
  public void setWeight(int newWeight) {
    if (newWeight > 0) {
      weight = newWeight;
    } else {
      System.out.println("Error - weight must be positive");
    }
  }
  
  public int getWeight() {
    return weight;
  }
  public void getOlder(){
    age++;
  }
  public int getAge(){
    return age;
  }
}
