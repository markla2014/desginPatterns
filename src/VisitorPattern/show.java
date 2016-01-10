package VisitorPattern;
/**
 *  访问者模式： 表示一个作用于某个对象结构中的各元素的操作。它使你可以在不改变元素类的前提下定义作用于这些元素的新操作
 *  访问者模式适用于数据结构相对稳定的系统，吧数据结构和作用于数据结构上的错做之间的耦合解脱来，使得操作集合可以相对自由的烟花
 *  目的： 是把处理从数据结构分离出来，有易于变化的算法的话，使访问者模式就比较合适，因为访问者模式使得算法操作的增加变得个兼容
 *  每增加一个新的操作，就意味着增加一个新的访问者。访问者模式将有关的行为集中到一个访问对象中
 * @author markla
 *
 */
public class show {
	
  public static void main(String[] args){
	  ObjectStructure o=new ObjectStructure();
	  o.Attach(new Man());
	  o.Attach(new Woman());
	  Success v1=new Success();
	  o.Display(v1);
	  Failing v2=new Failing();
	  o.Display(v2);
  }
}
