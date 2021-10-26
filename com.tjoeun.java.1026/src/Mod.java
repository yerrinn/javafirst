
public class Mod {
	
	public static void main(String[] args) {
		
		int i = 0;
		//3가지 동작을 1초마다 번갈아 가면서 수행
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			//3으로 나눈 나머지 - 0,1,2
			int mod = i%7;
			
			if(mod==0) {System.out.println("월");}
			if(mod==1) {System.out.println("화");}
			if(mod==3) {System.out.println("수");}
			if(mod==4) {System.out.println("목");}
			if(mod==5) {System.out.println("금");}
			if(mod==6) {System.out.println("토");}
			
			i++;
		}
	}

}
