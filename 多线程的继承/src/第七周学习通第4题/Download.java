package 第七周学习通第4题;

public class Download implements Runnable{
       private int dc[]={1,2,3,4,5,6,7,8,9,10,11,12};
       private int i=1;
       public void run(){
    	   while (true){
    		   if(i<5){
    			   Thread th=Thread.currentThread();
    			   String th_name=th.getName();
    			   
    		   }
    	   }
       }
}
