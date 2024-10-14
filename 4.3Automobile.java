public class Automobile{
  String Make;
  String Model;
  int MPG;

  public Automobile(String startMake, String startModel, int startMPG){
    Make = startMake;
    Model = startModel;
    MPG = startMPG;
  }
  
  public String getMake(){
    return Make;
  }

  public String getModel(){
    return Model;
  }

  public int getMPG(){
    return MPG;
  }
}
