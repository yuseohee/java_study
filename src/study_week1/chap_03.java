package study_week1;

public class chap_03 { //������
	 public static void main(String[] args){
		 chap_03 q32 = new chap_03();
		 q32.Q3_2();
		 q32.Q3_8();
	 }
	public void Q3_2(){
		/*
		 *  Q [3-2]
		 *  [3-2] �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�. ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 
		 *  13���� �ٱ��ϰ� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�
		 */
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples/sizeOfBucket; // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);	
	}
	
	public void Q3_8(){
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); //byte�� ���׿����� �ϱ����� int type���� �ڵ� ����ȯ�Ǳ⶧����, byte�� ����ȯ�� �������
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
