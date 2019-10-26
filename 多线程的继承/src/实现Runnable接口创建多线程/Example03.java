package 实现Runnable接口创建多线程;

public class Example03 {
  private static int b=100;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
