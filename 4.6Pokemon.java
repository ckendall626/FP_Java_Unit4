public class Pokemon {
  int HP;
  String PkmnName;
  int def;
  String enemyPkmnAttacktype;

  public Pokemon (int startHP, String startPkmnName, int startDef){
    HP = startHP;
    PkmnName = startPkmnName;
    def = startDef;
  }
  public void declareAttack (String selectedattack){
    System.out.println(PkmnName + " used " + selectedattack);
  }

}