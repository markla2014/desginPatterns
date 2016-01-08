package Memento;

public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     GameRole a=new GameRole();
     a.GetInitState();
     a.StateDisplay();
     RoleStateCaretaker sateAdmin=new RoleStateCaretaker();
     sateAdmin.setMemento(a.SaveSate());
     a.Fight();
     a.StateDisplay();
     a.SaveSate();
     a.RecoverState(sateAdmin.getMemento());
     a.StateDisplay();
	}

}
