package �ع���;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
          Customer c = new Customer("����");
          c.addRental(new Rental(new Movie("black",2),5));
          c.addRental(new Rental(new Movie("white",1),5));
          c.addRental(new Rental(new Movie("gray",0),5));
          System.out.println("�����嵥:" + "\n" + c.statement());
	}

}
