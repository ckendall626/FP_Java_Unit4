public class Toracat extends Litten{

  String ToracatAttack;
  
  public Toracat(int ToracatHP, String ToracatName, int ToracatDef, String startTorcatAttack){
  super(ToracatHP, ToracatName, ToracatDef, "");
    startTorcatAttack = ToracatAttack;
    
  }

  public void attack(String exToracatAttack){
    if (exToracatAttack == LittenAttack){ //Since Toracat is an evolution, it can access Litten's attack and attacks of its own. Additionally, the method now has an imput because Toracat has multiple attacks to choose from which can be accessed by player input if it was a legit game
      super.attack();
      System.out.println("Toracat uses" + LittenAttack + " and deals extra damage!!");
    }
    else if (exToracatAttack == "Fire Fang"){
      ToracatAttack = "Fire Fang";
      declareAttack("Fire Fang");
    }
    else if (exToracatAttack == "Flamethrower"){
      ToracatAttack = "Flamethrower";
      declareAttack("Flamethrower");
    }
  }
  
  @Override
  public String Speak(){
    return "Toracat says: When in disgrace with fortune and men’s eyes / I all alone beweep my outcast state, / And trouble deaf heaven with my bootless cries, / And look upon myself, and curse my fate, / Wishing me like to one more rich in hope, / Featured like him, like him with friends possessed, / Desiring this man’s art, and that man’s scope, / With what I most enjoy contented least; / Yet in these thoughts my self almost despising, / Haply I think on thee, and then my state, / Like to the lark at break of day arising / From sullen earth, sings hymns at heaven’s gate; / For thy sweet love remembered such wealth brings / That then I scorn to change my state with kings.";
  }
}