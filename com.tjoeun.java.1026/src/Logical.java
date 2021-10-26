
public class Logical {

	public static void main(String[] args) {
		
		System.out.println(10>3);
		
		
		int year = 2021;
		//year가 윤년인지 판별
		//year가 4의 배수이고 100의 배수가 아니면 윤년
		boolean pan = year%4==0 && year%100!=0;
		if(pan==true) {
			System.out.println("year는 윤년");
		}else {
			System.out.println("year는 윤년이 아님");
		}
		
		
		System.out.println("------------------------------");
		
		
		//and나 or은 좌우의 식의 순서를 변경해도 결과는 동일
		//&&는 앞의 결과가 false이면 뒤의 결과를 확인하지 않음
		//||는 앞의결과가 true이면 뒤의 결과를 확인하지 않음
		//1부터 100까지 수 중 3의배수이면서 4의배수인 수의 갯수 확인
		int count=0;
		for(int i=1; i<100; i++) {
			if(i%4==0 && i%3==0) {
				count++;
			}
		}System.out.println(count);
		
		
		System.out.println("------------------------------");
		
		int x = 10;
		boolean r = x>5 && x++>10;
		System.out.println(x);  //x값? 
		
		x = 10;
		r = x<5 && x++>10;
		System.out.println(x);  //x값?

	}

}
