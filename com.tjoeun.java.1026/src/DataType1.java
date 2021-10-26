
public class DataType1 {

	public static void main(String[] args) {

		//정수를 저장하는 변수 만들고 데이터 대입
		int age = 25;
		System.out.println(age);
		
		//문자열을 저장하는 변수를 만들고 데이터를 대입
		String name = "Yerin";
		System.out.println(name);
		
		System.out.println("My name is " + name + ", I'm " + age + "years old.");
		
		
		//문자 - 실제로는 정수로 저장
		char ch = 'A';
		System.out.println(ch);
		//코드를 저장
		//숫자 0 은 48, A=65, a=97
		ch = 65;
		System.out.println(ch);
		System.out.println('a' - 'A');
		
		//제어문자 사용
		System.out.println("Hello\nJava");
		
	}

}
