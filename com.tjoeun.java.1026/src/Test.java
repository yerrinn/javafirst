
public class Test {
	
	public static void main(String[] args) {
		
		
		double d = 10.4;
		//d의 값을 소수 첫째 자리에서 반올림해서 저장
		//강제 형 변환과 사칙연산을 적절히 이용해서		
		int result=(int)(d+0.5);		
		System.out.println(result);
		
		
		d = 10.77;
		//소수 둘째자리에서 반올림해서 출력
		System.out.println((int)(d * 10 + 0.5)/10.0);
		
		
		int money = 87650;
		//10의자리에서 반올림해서 출력하기 => 87700
		//876.50
		System.out.println(100*((int)((double)money/100 + 0.5)));
		
	}

}
