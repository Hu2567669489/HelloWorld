package ʵ��Runnable�ӿڴ������߳�;

public class Example03 {
  private static int b=100;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        Mythread mythread = new Mythread();
        Thread thread = new Thread(mythread);
        thread.start();
        while(true){
        	if(b>0){
        		System.out.println("main");
        	   b--;
        	}
        }
	}

}
