
public class Etc_2 {

	public static void main(String[] args) {
		// 제어문 안의 실행문장이 1개일때는{} 생략가능
		for(int i=0; i<3; i=i+1) // {
			System.out.println("Hello World");
		//}
		for(int i=0; i<3; i=i+1);{  // 제어문 뒤에 ;를 붙혀 없는 것 고 동일, 한 번만 수행
			System.out.println("한번만 수행");

		}
		//이런식의 코드는 에러
		//for(;;) {}
		//System.out.println("Dead Code");

	
	}

}
