
public class DataTypeCasting {

	public static void main(String[] args) {
		
		//���� ������ �Ǽ� ������ ���� - ����
		//int age = 25.6;
		
		//�Ǽ� ������ ���� �����͸� ����
		//�ڵ� �� ��ȯ�� �߻��ؼ� ���� �߻���������
		double height = 160;
		System.out.println("Ű�� " + height + "�Դϴ�.");
		
		
		//���� �� ��ȯ
		//�������� �ڷ����� �����ؼ� ����
		//�Ǽ��� ������ �����ؼ� ����
		//�Ҽ��� ���ŵ�
		int age = (int)25.6;
		System.out.println("���̴� " + age + "�Դϴ�.");
		
		
		//ǥ������ ���� ���ڸ� ������ ��ȯ�ؼ� �����ϸ� overflow�� underflow�� �߻�
		//overflow : ���� ū ������ �Ѿ�� ���� ���� �ͺ��� �ٽ� ����
		//underflow : ���� ���������� �Ѿ�� ���� ū �ͺ��� �ٽ� ����
		//byte�� -128 ~ 127���� ǥ������
		byte b = (byte)128;
		System.out.println("b�� " + b);  //overflow
		b = (byte)-130;
		System.out.println("b�� " + b);
		

	}

}
