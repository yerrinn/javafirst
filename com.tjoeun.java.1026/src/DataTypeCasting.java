
public class DataTypeCasting {

	public static void main(String[] args) {
		
		//정수 변수에 실수 데이터 삽입 - 에러
		//int age = 25.6;
		
		//실수 변수에 정수 데이터를 대입
		//자동 형 변환이 발생해서 에러 발생하지않음
		double height = 160;
		System.out.println("키는 " + height + "입니다.");
		
		
		//강제 형 변환
		//데이터의 자료형을 변경해서 대입
		//실수를 정수로 변경해서 대입
		//소수는 제거됨
		int age = (int)25.6;
		System.out.println("나이는 " + age + "입니다.");
		
		
		//표현범위 밖의 숫자를 강제로 변환해서 대입하면 overflow나 underflow가 발생
		//overflow : 가장 큰 쪽으로 넘어가서 가장 작은 것부터 다시 시작
		//underflow : 가장 작은쪽으로 넘어가서 가장 큰 것부터 다시 시작
		//byte는 -128 ~ 127까지 표현가능
		byte b = (byte)128;
		System.out.println("b는 " + b);  //overflow
		b = (byte)-130;
		System.out.println("b는 " + b);
		

	}

}
