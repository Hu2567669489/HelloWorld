package example13;

public class Ticket1 implements Runnable{
       private int tickets=10;
       public void run(){
    	   while(true){
    		   saleTicket();
    		   if(tickets<=0){
    			   break;
    		   }
    	   }
       }
    
	private void saleTicket() {
		// TODO �Զ����ɵķ������
		
	}

	private synchronized void saleTicke(){
	if(tickets>0){
		try{
			Thread.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---������Ʊ"+tickets--);
	}
   }   
}