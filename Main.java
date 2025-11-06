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


      // IF STATEMENTS: use boolean expressions to make DECISIONS about which code to execute 
      double time = 8.5; // means 8:30 AM 
      time = 7.75; // means 7:45 AM 
      time = 8.25; // means 8:15 AM 
      // Two way SELECTION: if block plus + else block
      time = 8.0;
      if (time < 8) {
         System.out.println("Eligible for elevator!"); 
      }
      else {
         // Statement in ELSE block runs when IF block is false 
         System.out.println("Take the stairs..."); 
      }

      // Another example of TWO-WAY SELECTION 
      // in this case, using just a boolean VALUE (not an EXPRESSION) 
      boolean heads = false; // flipped tails  
      // if (true)
      if (heads == true) {
         System.out.println("Flipped Heads! Wear White."); 
      }
      else {
         System.out.println("Flipped tails! Wear black.");
      }

      // Multi way selectiobn
      // 1. NESTING if statments is loke asking follow up questions
      int age = 6;
      boolean havePermit = false;
      System.out.println("can u drive");

      if ( age >= 16 ) {
         System.out.println("I GUESSS r old enough");
         // pass first, ask follow
         if (havePermit == true) {
            System.out.println("get in scallywag");
         }
      }
      else {
         System.out.println("noo ur young boi get ur age up");
      }
      





























   
   }
}
