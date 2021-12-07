// Allen Bao
// 11/23/21
// A program that runs a stock market simulation by betting the amount the user inputs for 4 different traders.
// Each trader has a different name and success rate, but starts off with the same amount of money (1000 dollars)
// CLEAN VERSION OF STOCKMARKET.JAVA!!!

// import scanner class
import java.util.Scanner;

// A "casino" class
public class StockMarketCleanVersion {

    public static void main(String Args[]) {

        // create 4 instances of the trader class, each one representing a different trade
        Trader[] traders = {new Trader("Trader1"), new Trader("Trader2"), new Trader("Trader3"), new Trader("Trader4")};
        
        // create an array to store each trader's stockChangePercentage
        double[] stockChangePercentages = {0.61, 0.19, 0.81, 0.42};
        
        // loop through every item in both traders and stockExchangePercentages
        for (int i = 0; i < traders.length; ++i) {
            // set stock change percentage (stockChangePercentage) for each player with the values in stockChangePercentages
            traders[i].setStockChangePercentage(stockChangePercentages[i]);
            
            // print the name of each trader and their stockChangePercentage
            System.out.println("Name: " + traders[i].getTraderName() + " \nStockChangePercentage: " + traders[i].getStockChangePercentage());
        }

        // create scanner
        Scanner keyboard = new Scanner(System.in);
        
        // initialize variable used in loop
        double dollarsSpend;
        
        // infinite while loop
        while (true) {
        
            // print each trader's name, amount spent, the dollars made, and net profit
            for (Trader trader : traders) {
               System.out.println("\nName: " + trader.getTraderName() + "\nDollars Spent: " + trader.getDollarsSpent() + "\nBalance: " + trader.getDollarsMade() + "\nNet Profit: " + trader.getNetProfit());
            }
            
            // ask the user how much they want to bet and store their input in dollarsSpend
            System.out.println("How much money do you want to bet? ");
            dollarsSpend = keyboard.nextDouble(); // Inputs that'd break the code would be strings and characters that aren't numbers
            
            // if user bets zero dollars the while loop terminates
            if (dollarsSpend == 0) {
               break;
            }
            
            // bet the money the user inputted
            else {
               for (Trader trader : traders) {
                  trader.tradeSomeMore(dollarsSpend);
               }
            }
        }

    }
}
