package Memento;

public class RoleStateMemento {
  public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
private int vit;//vitality 
  private int atk;//attack
  private int def;//defend
  public RoleStateMemento(int vit,int atk,int def){
	  this.vit=vit;
	  this.atk=atk;
	  this.def=def;
	  
  }
  
}
