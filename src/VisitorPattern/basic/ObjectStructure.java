package VisitorPattern.basic;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
  private List<Element> elements=new LinkedList<Element>();
  public void Attach(Element element){
	  elements.add(element);
  }
  public void Detach(Element element){
	  elements.remove(element);
  }
  public void Accept(Visitor visitor){
     elements.forEach(e->e.Accept(visitor));
  }
}
