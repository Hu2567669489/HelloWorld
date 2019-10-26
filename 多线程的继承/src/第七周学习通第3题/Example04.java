package 第七周学习通第3题;

public class Example04 {
       public static void main (String[] args){
    	   TaxiWork tw=new TaxiWork();
    	   new Thread(tw,"taxi 1").start();
    	   new Thread(tw,"taxi 2").start();
    	   new Thread(tw,"taxi 3").start();
    	   new Thread(tw,"taxi 4").start();
    	   new Thread(tw,"taxi 5").start();
       }
}
