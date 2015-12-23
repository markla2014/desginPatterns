package dynamicprroxy;

public class Client {  
	  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        LogHandler logHandler = new LogHandler();  
        usemanager userManager = (usemanager)logHandler.newProxyInstance(new UserManagerImpl());  
        userManager.findUser("0001");  
    }  
}
