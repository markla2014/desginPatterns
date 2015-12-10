package AdapterPattern;
/*
 * Adapter calss can be user 
 * i can be used by the api is not really suitable for the current common api 
 */
public class Translator extends Player {
   private ForeignCenter wjzf=new ForeignCenter();
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		wjzf.attack1();
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		wjzf.defense1();
	}
	public static void main(String args[]){
	Player ym=new Translator("mark");
	ym.Attack();
	ym.Defense();
 }
}
