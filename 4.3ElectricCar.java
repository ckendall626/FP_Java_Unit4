public class ElectricCar extends Automobile{
  double charge;

  public ElectricCar(String elecmake, String elecmodel, int elecmpg, double startcharge){
    super(elecmake, elecmodel, elecmpg); // uses superclass constructor
    startcharge = charge; //plus charge for ElectricCar specifically
  }
  
  public int getMPG(){ //overrides the original method
    System.out.println("This car is electric and needs to be charged");
    return super.getMPG(); //returns overriden method
  }
}