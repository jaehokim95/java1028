
public class Toggle {

	public static void main(String[] args) {
		// 
		for (int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1);
			}catch(Exception e) {}

				if(i%2 == 0) {
					System.out.println("on");
				}else {
					System.out.println("off");

				}
			}
		
		//오미크론, 라투, 다크스펙터 순서대로 출력
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			if( i % 5 ==0) {
				System.out.println("오미크론");
			}else if(i % 5 ==1) {
				System.out.println("라투");
			}else if(i % 5 ==2) {
				System.out.println("다크스펙터");
			}else if(i % 5 ==3) {
				System.out.println("오미크론");
			}else if(i % 5 ==4) {
				System.out.println("다크스펙터");
				
				
				
			}
			}
		
		}
		
		}

	


