package 多线程的继承;

public class Example02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        MyThread myThread = new MyThread();
        myThread.start();
        while(true){
        	System.out.println("main()方法在运行");
        }
	}

}
