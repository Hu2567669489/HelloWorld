package ���Ź���ϵͳ;

public class TelcomAccountSystem {
	public static void main(String[] args){
		//ʵ����һ�������û���TelcomUser
		TelcomUser telcomUser=new TelcomUser("15937203595");
		//����ͨ����¼
		telcomUser.generateCommubicateRecord();
		//��ӡͨ���굥
		telcomUser.printDetails();
	}
}
