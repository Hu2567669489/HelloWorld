package 重构四;

public class Main {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Customer c = new Customer("李明");
        c.addRental(new Rental(new Movie("black",2),4));
        c.addRental(new Rental(new Movie("white",1),5));
        c.addRental(new Rental(new Movie("gray",0),6));
        System.out.println("租用清单:" + "\n" + c.statement());
	}

}
