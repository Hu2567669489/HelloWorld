package example13;

public class Example13 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
          Ticket1 ticket=new Ticket1();
          new Thread(ticket,"�߳�һ").start();
          new Thread(ticket,"�̶߳�").start();
          new Thread(ticket,"�߳���").start();
          new Thread(ticket,"�߳���").start();
	}

}
