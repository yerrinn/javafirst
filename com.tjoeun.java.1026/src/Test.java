
public class Test {
	
	public static void main(String[] args) {
		
		
		double d = 10.4;
		//d�� ���� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ����
		//���� �� ��ȯ�� ��Ģ������ ������ �̿��ؼ�		
		int result=(int)(d+0.5);		
		System.out.println(result);
		
		
		d = 10.77;
		//�Ҽ� ��°�ڸ����� �ݿø��ؼ� ���
		System.out.println((int)(d * 10 + 0.5)/10.0);
		
		
		int money = 87650;
		//10���ڸ����� �ݿø��ؼ� ����ϱ� => 87700
		//876.50
		System.out.println(100*((int)((double)money/100 + 0.5)));
		
	}

}
