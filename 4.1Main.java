class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    TalkingDog td = new TalkingDog(0);
    td.setWeight(70);
    System.out.println("My age is " + td.getAge());
    td.sayWeight();
    td.getOlder();
    System.out.println("My age is now " + td.getAge());

    //behaves how I expect
  }
}