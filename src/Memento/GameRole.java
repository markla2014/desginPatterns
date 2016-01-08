/**
 * 
 */
package Memento;

/**
 * @author markla
 *
 */
public class GameRole {
	private int vit;
	private int atk;
	private int def;
	
    public void GetInitState(){
    	vit=79;
    	atk=25;
    	def=35;
    }
    public void StateDisplay(){
    	System.out.println(" attack: "+atk+" victiry: "+this.vit+" defend: "+this.def);
    }
    public void Fight(){
    	vit=23;
    	atk=45;
    	def=98;
    }
	public RoleStateMemento SaveSate(){
		return new RoleStateMemento(vit, atk, def);
		
	}
	public void RecoverState(RoleStateMemento memento){
		this.vit=memento.getVit();
		this.atk=memento.getAtk();
		this.def=memento.getDef();
	}

}
