package 第七周学习通第4题;

public class Example01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Thread(new Download(),"路线一").start();
		new Thread(new Download(),"路线二").start();

	}

}
