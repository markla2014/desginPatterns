package BuliderPattern;

import java.util.LinkedList;
import java.util.List;

public class Porduct {
List<String> parts=new LinkedList<String>();
public void add(String part){
	parts.add(part);
}
public void show(){
	System.out.println("product create");
	for(String part : parts){
		System.out.println("the part is: "+part);
	}
}
}
