import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;

public class CashRegister {

  public Map<String, Double> coinType = new HashMap<String,Double>();
  public double purchase = 0.0;
  public double payment = 0.0;

  /**
  *  input: a filename contains coins description that this cash register can accept
  *  thows: NumberFormatException when the coin value is not a number
   * @throws FileNotFoundException
  */
  public CashRegister(String coinFileName) throws NumberFormatException {
    // TODO: implement CashRegister constructor method
    File file = new File(coinFileName) ;
    try {
          Scanner input = new Scanner(file) ;
          while (input.hasNext()) {
          String coinName = input.next() ;
          Double coinValue = input.nextDouble();
          coinType.put(coinName, coinValue) ;
          }
        }
    catch (Exception e) {
      throw new NumberFormatException("Incorrect coin format");
    }
    
  }

  public double getPurchase(){
    // TODO: implement getAmount() method
    return purchase;
  }

  public double getPayment(){
    // TODO: implement getPayment() method
    return payment;
  }

  // Return list of acceptable coins for this cash registration. For example
  // Note that the format is not strict, as long as you can get all coins' names and values
  /*
    nickel   0.05
    dime     0.10
    quater   0.25
    penny    0.01
    dollar   1.00
  */
  public String getCoinTypeList(){
    // TODO: implement getCoinType() method
    String result = "" ;
    for (String i : coinType.keySet()) {
      String num = String.format("%.2f", coinType.get(i)) ;
      result += i + " " + num + "\n" ; 
    }
    return result;
  }
  
  
  public void recordPurchase(double amount){
    // TODO: implement recordPurchase() method
    purchase += amount ;
    
  }

  public void recordPayment(int coinCount, String coinName) throws IllegalArgumentException {
    // TODO: implement recordPayment() method
    Double result_ = 0.0 ;
     boolean check = false ;
    for (String i : coinType.keySet()) {
         if (coinName.equalsIgnoreCase(i)) {
           check = true ;
          result_ = coinCount*coinType.get(i) ; 
        }
    }
    if (!check) {
      throw new IllegalArgumentException("This cash registration doesn't accept this coin: "+ coinName) ;
    }
    payment += result_ ;
   

  }

  // Return a receipt string in the following format. For example,
  /*
    Case 1: sufficient payment
    Sale person: <YOUR NAME>
    Purchase Amount:\t9.99
    Payment Amount:\t11.0
    Change Amount:\t\t1.01

    Case 2: insufficient payment
    Sale person: <YOUR NAME>
    Purchase Amount:\t9.99
    Payment Amount:\t11.0
    NOTE: Insufficent payment, please insert more coins.
  */

  public String getReceipt(){
    // TODO: change <YOUR NAME> text to be your firstname and lastname
    String receipt = "Sale person: " + "<Pattaravit Suksri>";
    // 
    receipt += "\nPurchase Amount: \t" + purchase + "\nPayment Amount: \t" + payment;
    if(payment < purchase){
      receipt += "\nNOTE: Insufficient payment, please insert more coins.\n";
    } else{
      receipt += "\nChange Amount: \t\t" + String.format("%.2f", (payment - purchase)) + "\n";
    }

    return receipt;
  }

  // Print reciept in the output file according to the format in getReceipt method
  public void printReceipt(String outputFile){
    // TODO: implement printReceipt(..) method
    try{
    File file = new File(outputFile) ;
    PrintWriter output = new PrintWriter(file) ;
    output.print(getReceipt());
    output.close();
  }
  catch (FileNotFoundException e) {
    System.out.println("");
  }
}

}