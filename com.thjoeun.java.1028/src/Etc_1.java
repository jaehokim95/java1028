
public class Etc_1 {

	public static void main(String[] args) {
		//1부터 10까지 출력하는 반복문

		//while를 사용해서

		int a = 0;
		while(a<10){
			System.out.println(a+1);
			a = a+1;

		}

		//for을 사용해


		for(int i=1; i<11; i=i+1) {
			//break - 3의 배수가 되면 아래 문장을 수행하지 않기 때문에 출력이 되지않음
			//continue - 3의 배수가 되면 더 이상내용을 수행하지 않고 다음 반복으로 이동
			if(i%3 ==0) 
				continue; //break
			System.out.println(i);
		}
		System.out.println("================");

	}

}


