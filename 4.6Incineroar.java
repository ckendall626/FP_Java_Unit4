public class Incineroar extends Toracat{

  String IncineroarAttack;

  public Incineroar (int IncineroarHP, String IncineroarName, int IncineroarDef, String startIncineroarAttack){
    super(IncineroarHP, IncineroarName, IncineroarDef, "");
    startIncineroarAttack = IncineroarAttack;
  }

  public void attack(String exIncineroarAttack){
    if (exIncineroarAttack == LittenAttack){ //same deal with Toracat
      super.attack(LittenAttack);
      System.out.println("Incineroar uses" + LittenAttack + " and deals extra extra damage!!");
    }
    else if (exIncineroarAttack == "Fire Fang" || exIncineroarAttack == "Flamethrower"){
      super.attack(exIncineroarAttack);
       System.out.println("Incineroar uses" + exIncineroarAttack + " and deals extra damage!!");
    }
    else if (exIncineroarAttack == "Darkest Lariat"){
      IncineroarAttack = "Darkest Lariat";
      declareAttack("Darkest Lariat");
    }
    else if (exIncineroarAttack == "Throat Chop"){
      IncineroarAttack = "Throat Chop";
      declareAttack("Throat Chop");
    }
  }
  @Override
  public String Speak (){
    return "Incineroar says: Roar";
  }
} 