package study_week1;

public class chap_05 {//배열
	public static void main(String[] args) {
		chap_05 q56 = new chap_05 ();
		q56.q5_6();
	}
	
	public void q5_6(){
		/*
		 * 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
		 * 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 
		 * 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		 * 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		 */
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int firstCoinCnt = money/coinUnit[i];
			
			System.out.println(coinUnit[i] + "갯수:  " + firstCoinCnt + "개" );
			money = money - coinUnit[i]*firstCoinCnt;
		}
	}
}
