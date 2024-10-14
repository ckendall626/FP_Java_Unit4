public class TalkingDog extends Dog {

  public TalkingDog(int startagee) {
    super(startagee);
  }
  
  public void sayWeight(){
    System.out.println("Wow my weight is " + getWeight() + ". Witty remark");
  }
}