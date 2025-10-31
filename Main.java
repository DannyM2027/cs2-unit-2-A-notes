public class Main {

   public static void main(String []args) {
      
      // BOOLEAN variables can only holy true or false
      boolean lightsOn = false;
      boolean dannyPresent = true;
      // boolean expressions like questions
      boolean exp1 = (dannyPresent == true); // am i here?
      boolean exp2 = (lightsOn != true); //are the lights mot on?

      // comparing numerical values
      int x = 6;
      int y = 7;

      System.out.println( x== y);
      // checl for not using the != op
      boolean exp3 = (x != y);
      System.out.println( exp3);

      // compare numeric values using relational operators
      System.out.println( x < y );
      System.out.println( x > y);
      System.out.println(x <= y );
      System.out.println( x >= y);
      System.out.println( y >= x); // order matter
      System.out.println( y == y);

      double z = 6.0;
      System.out.println( x == z);





























   
   }
}
