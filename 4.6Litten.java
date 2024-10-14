public class Litten extends Pokemon implements FireTypePokemon{
String LittenAttack;
  
  public Litten(int LittenHP, String LittenName, int LittenDef, String startLittenAttack){
    super(LittenHP, LittenName, LittenDef);
    startLittenAttack = LittenAttack;
  }
  
  public void attack(){ //Litten has only one attack and the player picks 1 attack out of the 2 available
    if (LittenAttack == "Bite"){
      declareAttack("Bite");
    }
    else if (LittenAttack == "Ember"){
      declareAttack("Ember");
    }
    }
  @Override
  public void Waterwkns (){
    if (enemyPkmnAttacktype == "Water"){
      System.out.println(PkmnName + "is weak to water and takes double damage!!");
    }
  }
  @Override
  public void GrassStrength (){
    if (enemyPkmnAttacktype == "Grass"){
      System.out.println(PkmnName + "is strong against grass and does double damage!!");
    }
  }
  public String Speak(){
    return "Litten says: Meow";
  }
}