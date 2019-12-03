package 重构四;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
    private Vector rentals1 = new Vector();
    
    public Customer(String name){
 	   this.name = name;
    }
    public void addRental(Rental arg){
 	   rentals1.addElement(arg);//arg是一个字符串数组变量
    }
    public String getName(){
 	   return name;
    }
    private double amountFor(Rental aRental){
    	return aRental.getCharge();
    }
    
    public String statement(){
    	
 	   double totalAmount = 0;
 	   int frequentRenterPoints = 0;
 	   Enumeration rentals = rentals1.elements();
 	   String result = "Rental Record for " + getName() + "\n";
 	   while(rentals.hasMoreElements()){
 		  // double thisAmount = 0;
 		   Rental each = (Rental)rentals.nextElement();
 		   //将遍历的内容，即对每个影片的计费单独调出来
 		  // thisAmount = each.getCharge();

 		   frequentRenterPoints += each.getFrequentRenterPoints();
 		  // if((each.getMovie().getPriceCode() == Movie.new_release)&&
 			//	   each.getDaysRented()>1) frequentRenterPoints ++;
 		   result += "\t" +each.getMovie().getTitle()+"\t"+
 				   String.valueOf(each.getCharge()) + "\n";
 				   totalAmount += each.getCharge();
 	   }
 	   result += "Amount owed is " + String.valueOf(totalAmount)+"\n";
 	   result += "You earned " + String.valueOf(frequentRenterPoints) + 
 			   " frequent renter points";
 	   return result;
    }
    
}
