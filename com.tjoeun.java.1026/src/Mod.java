
public class Mod {
	
	public static void main(String[] args) {
		
		int i = 0;
		//3���� ������ 1�ʸ��� ������ ���鼭 ����
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			//3���� ���� ������ - 0,1,2
			int mod = i%7;
			
			if(mod==0) {System.out.println("��");}
			if(mod==1) {System.out.println("ȭ");}
			if(mod==3) {System.out.println("��");}
			if(mod==4) {System.out.println("��");}
			if(mod==5) {System.out.println("��");}
			if(mod==6) {System.out.println("��");}
			
			i++;
		}
	}

}
