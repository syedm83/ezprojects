public class Die 
{
   // data declaration
   // we are making a new class to use in a program. This is added to our library
   private int faceValue; // private means the data isnt available outside the class. its hidden from other ppl
   
    
   // method declaration
   //constructor name is Die, constructor name is always the same as class name
   public Die()
   {
      faceValue = 1;
   }
   
   public Die(int yourFaceValue)
   {
      faceValue = yourFaceValue;
   }
   
   
   // method roll
   // void cuz we dont return a value for roll
   public void roll()
   {
      faceValue = (int)(Math.random()*6) + 1;  // gives numbers between [1 - 6]
      // had to do (int) to cast the decimal cuz *6 means [0 - 5.99999] so is did [0-5] the + 1 did [1-6]
   }
   
   //getter method (lets the user get data they want like the faceValue value
   //called accessor
   public int getFaceValue()
   {
      return faceValue;
   }

   //setter method (mutator, sets value to whatever parameter the user wants)
   public void setFaceValue(int face)
   {
      faceValue = face;
   }

   //toString method, doesnt take parameters, instead returns a string
   public String toString()
   {
      return "Die with face: " + faceValue;
   }
   
   // equals method
   public boolean equals(Die other)
   {
      return this.faceValue == other.faceValue;
   }
   
   //compareTo method
   public int compareTo(Die other)
   {
      if (faceValue == other.faceValue)
         return 0;
      else if (faceValue < other.faceValue)
         return -1;
      else
         return 1;
   }
}


            
   