import movie.*;
import rental.*;
import customer.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Movie m1 = new Movie("black",2);
        Movie m2 = new Movie("white",1);
        Movie m3 = new Movie("gray",0);
        Rental r1 = new Rental(m1,5);
        Rental r2 = new Rental(m2,6);
        Rental r3 = new Rental(m3,4);
        Customer c1 = new Customer("Liming");
        c1.addRental(r1);
        c1.addRental(r2);
        c1.addRental(r3);
        System.out.println("租用清单:" + "\n" + c1.statement());
	}

}
