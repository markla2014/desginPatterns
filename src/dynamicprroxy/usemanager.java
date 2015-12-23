package dynamicprroxy;

public interface usemanager {

	public void addUser(String userId,String userName);  
    public void modifyUser(String userId,String userName);  
    public void delUser(String userId);  
    public String findUser(String userId); 
}
