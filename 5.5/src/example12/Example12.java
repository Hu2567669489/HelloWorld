package example12;

public class Example12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
           Ticket1 ticket=new Ticket1();
           new Thread(ticket,"�߳�һ").start();
           new Thread(ticket,"�̶߳�").start();
           new Thread(ticket,"�߳���").start();
           new Thread(ticket,"�߳���").start();
	}

}
