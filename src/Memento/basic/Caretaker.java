package Memento.basic;


/**
 *管理者 
 *得到被网络
 * @author markla
 *
 */
public class Caretaker {
private Memento memento;

public Memento getMemento() {
	return memento;
}

public void setMemento(Memento memento) {
	this.memento = memento;
}

}
