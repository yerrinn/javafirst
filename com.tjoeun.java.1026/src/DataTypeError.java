
public class DataTypeError {

	public static void main(String[] args) {
		
		//변수를 생성하고 데이터를 저장한 후 출력
		char ch = 'F';
		System.out.println("ch는 " + ch + "입니다.");
		
		//char ch = 'a';  //에러
		//앞에서 'ch'라는 변수를 생성했는데 또 생성했기때문에 에러
		//해결법 1. 다른 변수를 생성해서 해결
		char ch1 = 'a';
		//해결법 2. 데이터의 종류가 같다면 변수를 재사용
		ch = 'a';
		
		//ch = 45.7;    //에러
		//변수를 만들 때는 char을 사용했는데 대입하는 데이터는 double이기때문에 엘
		//해결법 1. 실수 변수를 만들어서 대입
		double d = 45.7;
		//해결법 2. char로 변경해서 대입
		ch = (char)45.7;  //에러는 없어지지만 소수가 사라짐
		
		//System.out.println(cl); //에러
		//없는 변수인 cl 사용해서 에러
		//cl이라는 변수를 생성하거나 있ㄴ느 변수를 사용해야함.
		
		//에러는 아닌데 화면에 아무것도 출력되지 않음
		//13이 Enter기 때문(줄이 변경된것)
		char temp = 13;
		System.out.println(temp);
		

	}
	
	

}
