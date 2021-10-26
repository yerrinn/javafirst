
public class DoubleError {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0; i<100; i++) {
			sum = sum+1;
		}System.out.println(sum);
		
		//컴퓨터는 이진수로 계산하기때문에 오류
		//정수로 연산한 후 실수로 변경하면 정확한 결과 만들 수 있음
		double hap=0.0;
		for(int i=0; i<100; i++) {
			hap = hap+0.1;
		}System.out.println(hap);
		
		
		//오류
		System.out.println(0.2 == (1.0-0.8));
		

	}

}
