
public class DoubleError {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<100; i++) {
			sum = sum+1;
		}System.out.println(sum);
		
		//��ǻ�ʹ� �������� ����ϱ⶧���� ����
		//������ ������ �� �Ǽ��� �����ϸ� ��Ȯ�� ��� ���� �� ����
		double hap=0.0;
		for(int i=0; i<100; i++) {
			hap = hap+0.1;
		}System.out.println(hap);
		
		
		//����
		System.out.println(0.2 == (1.0-0.8));
		

	}

}
