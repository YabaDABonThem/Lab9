// Allen Bao
// 11/30/21
// A program that experiments with the Dog class by creating a few dogs and printing some attributes.

import java.util.Random;

public class DogKennel {
   public static void main(String[] args) {
      
      // Create new array of dog instances
      Dog[] dogs = new Dog[3];
      
      // Create random object to generate random ages and heights
      Random random = new Random();
      
      // Instantiate variables that hold the attributes of all the dogs
      int sumOfAges = 0;
      double sumOfHeights = 0;
      int numLikeBarking = 0;
      
      for (int i = 0; i < 3; i++) {
         // Loop through the indexes of the dogs array and put a dog instance at each position
         dogs[i] = new Dog();
         // Set the dog's height to a random double between 8 and 29
         // Since Random.nextDouble() only generates doubles between 0 an 1, the nondecimal part is generated by nextInt().
         dogs[i].setHeight(8 + random.nextInt(21) + random.nextDouble()); 
         // Set the dog's height to a random age between 0 and 30
         dogs[i].setAge(random.nextInt(31));
         dogs[i].setName("Dog" + (i + 1)); // The dog number starts at 1 instead of zero, so you have to add one to the index. 
         dogs[i].setLikesBarking(random.nextBoolean()); //
         // Update the stats of the dog group
         sumOfAges += dogs[i].getAge();
         sumOfHeights += dogs[i].getHeight();
         if (dogs[i].getLikesBarking()) {
            ++numLikeBarking;
         }
         
      }
            
      // Print welcome message, the sum of the dogs' age, the sum of the dog's height, the names of the dogs, and the number of dogs that like barking
      System.out.println("Welcome to the dog kennel");
      System.out.println("The sum of the dogs' ages is " + sumOfAges);
      System.out.println("The sum of the dogs' heights is " + sumOfHeights);
      System.out.println("The dogs are: " + dogs[0].getName() + ", " + dogs[1].getName() + ", " + dogs[2].getName());
      System.out.println(numLikeBarking + " dogs like barking");
   }
}