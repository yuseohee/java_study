package study_week1;

public class chap_05 {//�迭
	public static void main(String[] args) {
		chap_05 q56 = new chap_05 ();
		q56.q5_6();
	}
	
	public void q5_6(){
		/*
		 * ������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. 
		 * ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ����϶�. 
		 * ��, ������ �� ���� ���� �������� �Ž��� �־���Ѵ�. (1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
		 * ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		 */
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int firstCoinCnt = money/coinUnit[i];
			
			System.out.println(coinUnit[i] + "����:  " + firstCoinCnt + "��" );
			money = money - coinUnit[i]*firstCoinCnt;
		}
	}
}
