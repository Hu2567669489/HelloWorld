package ������ѧϰͨ��3��;

public class TaxiWork implements Runnable{
	private int passengers=1;
	public void run(){
		while(true){
			if(passengers<101){
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽӵ�"+passengers+++"λ�˿�");
			}
		}
	}

}
