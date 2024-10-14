class Main {
  public static void main(String[] args) {
    Marshmallow m1 = new Marshmallow(50, new String[] {"sugar", "gelatin"}, "white");
    Marshmallow m2 = new Marshmallow(50, new String[] {"sugar", "gelatin", "strawberry"}, "pink");
    Dessert[] dessertOptions = new Dessert[2];
    dessertOptions[0] = m1;
    dessertOptions[1] = m2;
    for (Dessert d: dessertOptions) {
      // loops through each dessert in the array
      //Using a for loop to print out ingredients
      System.out.print("Item is made up of ");
      for (String ingredient: d.ingredients) {
        System.out.print(ingredient + ", ");
        // loops and prints out each ingredient per dessert
      }
    }
    Marshmallow[] marshes = new Marshmallow[2];
    marshes[0] = m1;
    marshes[1] = m2;
    for (Marshmallow m: marshes) {
      System.out.println("Item is " + m.color + " colored and its stale status is " + m.isStale);
    }
  }

}