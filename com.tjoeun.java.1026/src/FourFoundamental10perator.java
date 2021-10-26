
public class FourFoundamental10perator {

	public static void main(String[] args) {
		
		int result = 10+20;
		System.out.println("10 + 20 = " + result);
		
		//문자열+숫자는 문자열의 결합으로 리턴
		String str = "10" + 20;
		System.out.println("str: " +str);
		
		//10/3은 정수 사이의 연산이므로 결과는 3
		//1/2는 0
		result = 10/3;
		System.out.println("10 / 3 = " + result);
		
		byte b = 30;
		byte c = 20;
		//산술 연산을 하면 연산의 결과는 최소한 int
		//int는 byte보다 크므로 대입이 안됨
		//byte d = b+c;
		int d = b+c;  // 혹은 byte d = (byte)b+c
		System.out.println(d);
		//숫자 데이터에서 원하는 결과를 얻고자 할 때는 강제 형 변환을 적절히 이용하면 됨
		
		
		
		
		
		
		

	}

}
