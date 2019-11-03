package example12;

public class Example12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
           Ticket1 ticket=new Ticket1();
           new Thread(ticket,"线程一").start();
           new Thread(ticket,"线程二").start();
           new Thread(ticket,"线程三").start();
           new Thread(ticket,"线程四").start();
	}

}
