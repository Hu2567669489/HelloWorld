package ÖØ¹¹ËÄ;

public class Rental {
	private Movie movie;
    private int daysRented;
    public Rental(Movie movie,int daysRented){
  	  this.movie = movie;
  	  this.daysRented = daysRented;
    }
    public int getDaysRented(){
  	  return daysRented;
    }
    public Movie getMovie(){
  	  return movie;
    }
    int getFrequentRenterPoints(){
    	if((getMovie().getPriceCode() == Movie.new_release)&&
     	  getDaysRented()>1) return 2;
    	else
    		return 1;
    }
   public double getCharge(){
    	double result =0;
    	switch(getMovie().getPriceCode()){
    	case Movie.regular:
    		result += 2;
    		if(getDaysRented()>2)
    		result += (getDaysRented() -2)*1.5;
    		break;
    	case Movie.new_release:
    		result += getDaysRented()*3;
    		break;
    	case Movie.childrens:
    	result += 1.5;
    	if(getDaysRented()>3)
           result +=(getDaysRented()-3)*1.5;
           break;
    	}
    	return result;
    }
}
