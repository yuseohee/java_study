package study_week1;

public class chap_04 {//조건문과 반복문

	public static void main(String[] args) {
		chap_04 q4_5 = new chap_04();
		q4_5.forMoon();
		q4_5.whileMoon();
	
	} 
	
	/*
	 * for문의 출력문과 같도록 while로 만드시오 
	 */
	public void forMoon(){
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}//문제
	
	public void whileMoon(){//답
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
