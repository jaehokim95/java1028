
public class For_1 {

	public static void main(String[] args) {
		//Hello world를 3번 출력
		int i = 0;
		while(i<3) {
			System.out.println("Hello world");
			i = i + 1;
			//
			System.out.println("==============");

			//for를 이용해서 동일한 내용 작성

			for(int j=0; j<3; j=j+1) {
				System.out.println("Hello world");
			}

			//image1.png, image2.png, image3.png for를 이용해서 출력
			//for에서 첫번째 문장에서 변수를 반드시 생성할 필요가 없음
			//기존에 사용한 변수를 재사용 가능
			for(int a=0; a<3; a=a+1) {
				System.out.println("image" + (a+1) + ".png");
			}

			//제어문 안에서 만든 변수는 제어문 바깥에서 사용할 수 없음
			//ex) System.out.println(a); -> 오류
		}

	}
}


