// Allen Bao
// 11/23/21
// A trader class that trades money based off the amount given can give a few analytics about a specific trader.

// Import the Random class
import java.util.Random;

// A Class that defines an object of type Trader
public class Trader {

    // Create fields that store trader properties
    private String traderName;
    private double stockChangePercentage;
    private double dollarsSpent;
    private double dollarsMade;
    
    // getter that retrieves the value stockChangePercentage field
    public double getStockChangePercentage() {
      return stockChangePercentage;
    }
    
    // setter that assigns the field stockChangePercentage to percentage
    public void setStockChangePercentage(double percentage) {
      stockChangePercentage = percentage;
    }
    
    // method that determines if a trader won or lost money, and how much they won/lost
    public void tradeSomeMore(double dollars) {
      // Assigns dollarsSpent to the amount of money the trader bets
      dollarsSpent += dollars;
      
      // Creates a random double between zero and one
      Random randomNumbers = new Random();
      double randomDouble = randomNumbers.nextDouble();
      
      // If the number generated is less that the trader's stockChangePercentage, the trader makes money
      // Therefore, the greater the trader's stockChangePercentage, the more likely it is that they will make money
      if (randomDouble < stockChangePercentage) {
         System.out.println(traderName + " made money");
         // gain the dollars the trader bet
         dollarsMade += (dollars*2);
      }
      
      // If the number is less than or equal to the trader's stockChangePercentage
      else {
         System.out.println(traderName + " lost money");
         dollarsMade -= dollars*3;
         // lost the dollars the trader bet
      }
    }
    
    // getter for the traderName field
    public String getTraderName() {
      return traderName;
    }
    
    // getter for the dollarsSpent field
    public double getDollarsSpent() {
      return dollarsSpent;
    }
    
    // getter for the dollarsMade field
    public double getDollarsMade() {
      return dollarsMade;
    }
    
    // method that returns the trader's net profit
    public double getNetProfit() {
      return (dollarsMade - dollarsSpent);
    }
    
    // constructor that sets the default values for each field
    public Trader(String name) {
        traderName = name;
        dollarsMade = 1000;
        dollarsSpent = 0;
    }
}
