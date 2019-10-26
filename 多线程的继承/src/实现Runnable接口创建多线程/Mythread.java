package 实现Runnable接口创建多线程;

public class Mythread implements Runnable{
	private int a=50;
      public void run(){
    	  while(a>0){
    		  System.out.println("new");
    		  a--;
    	  }
      }
}
