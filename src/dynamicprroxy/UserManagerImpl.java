package dynamicprroxy;

public class UserManagerImpl implements usemanager {

	  public void addUser(String userId, String userName) {  
          System.out.println("���������û�,�û�Ϊ��"+userId+userName+"����");  
  }  
  /***** 
   * ɾ���û� 
   */  
  public void delUser(String userId) {  
      System.out.println("delUser,userId="+userId);  
  }  
  /*** 
   * �����û� 
   */  
  public String findUser(String userId) {  
      System.out.println("findUser,userId="+userId);  
      return userId;  
  }  

  public void modifyUser(String userId, String userName) {  
      System.out.println("modifyUser,userId="+userId);  
  }  
}