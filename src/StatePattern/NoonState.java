package StatePattern;

public class NoonState extends State{

	@Override
	public void WriteProgram(Work k) {
		if(k.getHour()<13){
	System.out.println(k.getHour()+"¶öÁË£¬·´¿Ö");
		}else{
			k.setState(new AfternoonState());
			k.WriteProgram();
		}
	}

}
