// Allen Bao
// 11/30/21
// A dog class with a couple fields, getters, and setters. 

public class Dog {

   // Instantiate Fields
   private double heightIn;
   private int ageYears;
   private String name;
   private boolean likesBarking;
   
   
   // Setter for the heightIn field
   public void setHeight(double height) {
      heightIn = height;
   }
   
   // Setter for the ageYears field
   public void setAge(int age){ 
      ageYears = age; 
   }
   
   // Setter for the name field
   public void setName(String name) {
      this.name = name;
   }
   
   // Setter for the likeBarking field
   public void setLikesBarking(boolean likesBarking) {
      this.likesBarking = likesBarking;
   }
   
   // Getter for the heightIn field
   public double getHeight() {
      return heightIn;
   }

   // Getter for the age field
   public int getAge() {
      return ageYears;
   }

   // Getter for the name field
   public String getName() {
      return name;
   }

   // Getter for the likesBarking field
   public boolean getLikesBarking() {
      return likesBarking;
   }
}