package study_week1;

public class chap_03 { //연산자
	 public static void main(String[] args){
		 chap_03 q32 = new chap_03();
		 q32.Q3_2();
		 q32.Q3_8();
	 }
	public void Q3_2(){
		/*
		 *  Q [3-2]
		 *  [3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		 *  13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오
		 */
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket; // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);	
	}
	
	public void Q3_8(){
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); //byte는 이항연산을 하기전에 int type으로 자동 형변환되기때문에, byte로 형변환을 해줘야함
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}
