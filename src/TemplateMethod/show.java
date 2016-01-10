package TemplateMethod;
/**
 * 模板方法模式： 定义一个错做中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤
 * 模板方法是通过把不变形为搬移到超类，去除子类中的重复代码来体现它的优势。模板方法模式就是提供了一个很好地代码复用平台。当不变的和可变的行为在方法的子类实现中混合在一起的是后，不变的行为就会在子类中重复出现。
 * 模板访谈法模式把这些行为搬移到单一的地方，这就帮助子类拜托重复的不变行为的纠缠
 * 当我们要完成某一个细节层次一致的一个过程或一系列步骤。但其个别步骤在跟详细的层次上的实现可能不同时，我们通常考虑使用模板方法模式来处理
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("student A");
     TestPaper studentA=new student1();
     studentA.Testquestion1();
     studentA.Testquestion2();
     studentA.Testquestion3();
     System.out.println("student B");
     TestPaper studentB=new student2();
     studentB.Testquestion1();
     studentB.Testquestion2();
     studentB.Testquestion3();
     
     
	}

}
