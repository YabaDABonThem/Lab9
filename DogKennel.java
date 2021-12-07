// Allen Bao
// 11/30/21
// A program that experiments with the Dog class by creating a few dogs and printing some attributes.

public class DogKennel {
   public static void main(String[] args) {
   
      System.out.println("Welcome to the dog kennel");
      
      // Create 3 Dog objects
      Dog dog1 = new Dog();
      Dog dog2 = new Dog();
      Dog dog3 = new Dog();
      
      // Set dog1 attributes
      dog1.setHeight(13.5);
      dog1.setAge(8);
      dog1.setName("Igor");
      dog1.setLikesBarking(true);

      // Set dog2 attributes      
      dog2.setHeight(8.2);
      dog2.setAge(5);
      dog2.setName("Lev");
      dog2.setLikesBarking(false);

      // Set dog3 attributes      
      dog3.setHeight(15.1);
      dog3.setAge(8);
      dog3.setName("Frost");
      dog3.setLikesBarking(true);
      
      // Print the sum of the dogs' age
      int sumOfAges = dog1.getAge() + dog2.getAge() + dog3.getAge();
      System.out.println("The sum of the dogs' ages is " + sumOfAges);
      
      // Print the sum of the dog's height
      double sumOfHeights = dog1.getHeight() + dog2.getHeight() + dog3.getHeight();
      System.out.println("The sum of the dogs' heights is " + sumOfHeights);
      
      // Print the names of the dogs
      System.out.println("The dogs are: " + dog1.getName() + ", " + dog2.getName() + ", " + dog3.getName());
      
      // See if the dogs like barking and increase the count if they do, then print the amount that like barking
      int numLikeBarking = 0;
      
      if (dog1.getLikesBarking())
         ++numLikeBarking;
      if (dog2.getLikesBarking())
         ++numLikeBarking;
      if (dog3.getLikesBarking())
         ++numLikeBarking;
         
      System.out.println(numLikeBarking + " dogs like barking");
   }
}