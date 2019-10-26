package chapter5program6exercise3;

public class TeacherWork implements Runnable{
       private int books=1;
       public void run(){
    	   while(true){
    		   if(books<81){
    			   Thread th=Thread.currentThread();
    			   String th_name=th.getName();
    			   System.out.println(th_name+"正在发第"+books+++"本");
    		   }
    	   }
       }
}    
