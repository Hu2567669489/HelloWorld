package 重构二;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
    private Vector rentals1 = new Vector();
    
    public Customer(String name){
 	   this.name = name;
    };
    public void addRental(Rental arg){
 	   rentals1.addElement(arg);//arg是一个字符串数组变量
    }
    public String getName(){
 	   return name;
    }
    public String statement(){
 	   double totalAmount = 0;
 	   int frequentRenterPoints = 0;
 	   Enumeration rentals = rentals1.elements();
 	   String result = "Rental Record for " + getName() + "\n";
 	   while(rentals.hasMoreElements()){
 		   double thisAmount = 0;
 		   Rental each = (Rental)rentals.nextElement();
 		   //将遍历的内容，即对每个影片的计费单独调出来
 		   thisAmount = amountFor(each);
 	/*	   switch(each.getMovie().getPriceCode()){
 		   case Movie.regular:
 			   thisAmount += 2;
 			   if(each.getDaysRented()>2)
 			     thisAmount +=(each.getDaysRented() -2)*1.5;
 			     break;
 		   case Movie.childrens:
 			   thisAmount += 1.5;
 			   if(each.getDaysRented()>3)
 				   thisAmount +=(each.getDaysRented() -3)*1.5;
 				   break;
 		   case Movie.new_release:
 			   thisAmount += each.getDaysRented()*3;
 			   break;
 		   }
   */
 		   frequentRenterPoints ++;
 		   if((each.getMovie().getPriceCode() == Movie.new_release)&&
 				   each.getDaysRented()>1) frequentRenterPoints ++;
 		   result += "\t" +each.getMovie().getTitle()+"\t"+
 				   String.valueOf(thisAmount) + "\n";
 				   totalAmount += thisAmount;
 	   }
 	   result += "Amount owed is " + String.valueOf(totalAmount)+"\n";
 	   result += "You earned " + String.valueOf(frequentRenterPoints) + 
 			   " frequent renter points";
 	   return result;
    }
    private double amountFor(Rental aRental){
    	double result =0;
    	switch(aRental.getMovie().getPriceCode()){
    	case Movie.regular:
    		result += 2;
    		if(aRental.getDaysRented()>2)
    		result += (aRental.getDaysRented() -2)*1.5;
    		break;
    	case Movie.new_release:
    		result += aRental.getDaysRented()*3;
    		break;
    	case Movie.childrens:
    	result += 1.5;
    	if(aRental.getDaysRented()>3)
           result +=(aRental.getDaysRented()-3)*1.5;
           break;
    	}
    	return result;
    }
}
