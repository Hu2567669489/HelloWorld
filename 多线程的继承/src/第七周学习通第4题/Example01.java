package ������ѧϰͨ��4��;

public class Example01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Thread(new Download(),"·��һ").start();
		new Thread(new Download(),"·�߶�").start();

	}

}
