package VisitorPattern;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
 private List<Person> elements=new LinkedList<Person>();
 
 public void Attach(Person element){
	 elements.add(element);
 }
 public void Detach(Person element){
	 elements.remove(element);
 }
 public void Display(Action visitor){
	 elements.forEach(e->e.Accept(visitor));
 }
}
