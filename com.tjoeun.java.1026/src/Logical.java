
public class Logical {

	public static void main(String[] args) {
		
		System.out.println(10>3);
		
		
		int year = 2021;
		//year�� �������� �Ǻ�
		//year�� 4�� ����̰� 100�� ����� �ƴϸ� ����
		boolean pan = year%4==0 && year%100!=0;
		if(pan==true) {
			System.out.println("year�� ����");
		}else {
			System.out.println("year�� ������ �ƴ�");
		}
		
		
		System.out.println("------------------------------");
		
		
		//and�� or�� �¿��� ���� ������ �����ص� ����� ����
		//&&�� ���� ����� false�̸� ���� ����� Ȯ������ ����
		//||�� ���ǰ���� true�̸� ���� ����� Ȯ������ ����
		//1���� 100���� �� �� 3�ǹ���̸鼭 4�ǹ���� ���� ���� Ȯ��
		int count=0;
		for(int i=1; i<100; i++) {
			if(i%4==0 && i%3==0) {
				count++;
			}
		}System.out.println(count);
		
		
		System.out.println("------------------------------");
		
		int x = 10;
		boolean r = x>5 && x++>10;
		System.out.println(x);  //x��? 
		
		x = 10;
		r = x<5 && x++>10;
		System.out.println(x);  //x��?

	}

}
