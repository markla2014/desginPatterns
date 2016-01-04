package BridgePattern;
/**
 *  桥接模式：将抽象部分和它的实现部分分离，使它们可以独立变化
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HandsetBrand ab;
      ab=new HandsetBrandM();
      ab.setHandsetSoft(new HandSetGame());
      ab.Run();
      ab.setHandsetSoft(new HandsetAddressList());
      ab.Run();
      ab=new HandsetBrandN();
      ab.setHandsetSoft(new HandSetGame());
      ab.Run();
      ab.setHandsetSoft(new HandsetAddressList());
      ab.Run();
	}

}
