package bank;

import java.util.HashMap;

public class DBUtil {
       private static DBUtil instance = null;
       private HashMap<String,User> users = new HashMap<String, User>();
       
       private DBUtil(){
    	   User u1 = new User();
    	   u1.setCardId("1001");
    	   u1.setCardPwd("12345");
    	   u1.setUserName("����");
    	   u1.setCall("18236269741");
    	   u1.setAccount(1000);
    	   users.put(u1.getCardId(),u1);
    	   
    	   User u2 = new User();
    	   u2.setCardId("1002");
    	   u2.setCardPwd("23456");
    	   u2.setUserName("����");
    	   u2.setCall("18236269742");
    	   u2.setAccount(1000);
    	   users.put(u2.getCardId(),u2);
    	   
    	   User u3 = new User();
    	   u3.setCardId("1003");
    	   u3.setCardPwd("34567");
    	   u3.setUserName("����");
    	   u3.setCall("18236269743");
    	   u3.setAccount(1000);
    	   users.put(u3.getCardId(),u3);
       }
  //��������ģʽ
       public static DBUtil getInstance(){
    	   if(instance == null){
    		   synchronized(DBUtil.class){
    			   if(instance == null){
    				   instance = new DBUtil();
    			   }
    		   }
    	   }
    	   return instance;
       }
       //�������п��Ż�ȡ��Ӧ�����˻�����Ϣ
       public User getUser(String cardId){
    	   User user = (User)users.get(cardId);
    	   return user;
       }
	public HashMap<String,User> getUsers() {
		
		return users;
	}
}
