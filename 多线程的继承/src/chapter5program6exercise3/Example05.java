package chapter5program6exercise3;

public class Example05 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        TeacherWork tw=new TeacherWork();
        new Thread (tw,"teacher1").start();
        new Thread (tw,"teacher2").start();
        new Thread (tw,"teacher3").start();
	}

}
