package study_week1;

public class chap_04 {//���ǹ��� �ݺ���

	public static void main(String[] args) {
		chap_04 q4_5 = new chap_04();
		q4_5.forMoon();
		q4_5.whileMoon();
	
	} 
	
	/*
	 * for���� ��¹��� ������ while�� ����ÿ� 
	 */
	public void forMoon(){
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}//����
	
	public void whileMoon(){//��
		int i=0;
		
		while(i<10){
			int j = 0;
			while(j <= i ){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
