public class Main {
    public static void main(String[] args) {
      System.out.println("Hello Hottie World");
      System.out.println("I am learning Java.");
      System.out.println(3 + 3);
      String name = "John";
      System.out.println(name);
      // int myInt = 9;
      // double myDouble = myInt;
      // System.out.println(myInt);
      // System.out.println(myDouble);
      double myDouble = 9.78d;
      int myInt = (int) myDouble; // Manual casting: double to int
      System.out.println(myDouble);   // Outputs 9.78
      System.out.println(myInt);      // Outputs 9
      int time = 22;
      if (time <10 ){
        System.out.println("Good morning.");

      }
       else if (time < 18){
        System.out.println("Good day");
       }
       else{
        System.out.println("Good evening");
       }
    }
}