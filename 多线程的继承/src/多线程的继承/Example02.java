package ���̵߳ļ̳�;

public class Example02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        MyThread myThread = new MyThread();
        myThread.start();
        while(true){
        	System.out.println("main()����������");
        }
	}

}
