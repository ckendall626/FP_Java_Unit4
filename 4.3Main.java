class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Automobile NJCar = new Automobile("Volkswagen", "Jetta", 70000);
    ElectricCar IveCar = new ElectricCar("Ferrari", "Stradale", 200000000, 0.5);
   AdAgency.printAutoAd(NJCar, 400000);
    AdAgency.printAutoAd(IveCar, 10000000);

  }
}