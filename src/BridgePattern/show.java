package BridgePattern;
/**
 *  �Ž�ģʽ�������󲿷ֺ�����ʵ�ֲ��ַ��룬ʹ���ǿ��Զ����仯
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
