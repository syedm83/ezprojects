public class TestDie
{
   public static void main(String[] args)
   {
      Die die1 = new Die();
      
      Die die2 = new Die(3);
      
      System.out.println(die1.getFaceValue()); // uses accessor to get faceValue value
      
      System.out.println(die1.getFaceValue()); // now it tells you what we rolled on the last line
      System.out.println(die2.getFaceValue());
      
      die1.roll(); // cant use print cuz its a void method, doesnt have a value. But if you just roll then it works
      die2.roll();
      System.out.println(die1);
      System.out.println(die2); // now this calls the toString method
      
      die2.setFaceValue(5); //setter method
      System.out.println(die2.toString());
      
      Die d3 = new Die(5);
      Die d4 = new Die(6);
      System.out.println(d3 == d4); // compares the address so false
      System.out.println (d3.equals(d4)); // compares values
      
      System.out.println(d4.compareTo(d3)); //if else statement in class file
   
   }

}