package ʵ��Runnable�ӿڴ������߳�;

public class Mythread implements Runnable{
	private int a=50;
      public void run(){
    	  while(a>0){
    		  System.out.println("new");
    		  a--;
    	  }
      }
}
