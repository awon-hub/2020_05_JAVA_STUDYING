
public class Ex19 {
	public static void main(String[] args) {
	// ���׿����� ������
		// int k1�� Ȧ������ ¦������ �Ǻ�����
		

		int k1 = 18;
		String result = (k1%2==1) ? "Ȧ��" : "¦��";
		System.out.println("��� : " + result);
		
		// int k2�� 60�̻��̸� �հ�, �ƴϸ� ���հ� �Ǻ�����
		int k2 = 56;
		result = (k2>=60) ? "�հ�" : "���հ�";
		System.out.println("��� : " + result);
		
		
		// char k3 = �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'g';
		result = (k3>='A'&& k3<='Z') ? "�빮��" : "�빮�ھƴ�";
		System.out.println("��� : " + result);		
		
		
		
		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�踦 �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°�?
		
		int wh = 10;
		int result1 = (wh>8) ? (8590*8)+(int)((8590*1.5)*(wh-8)) : 8590*wh;
		System.out.println("��� : " + result1+ "��");			
		
		
		//������ Ǯ��
		
		int time = 10;
		int dan = 8590;
		int pay = (time>8) ? (int)((8*dan)+(time-8)*dan*1.5): time * dan;
		System.out.println("��� : " + pay + "��");		
		
		
		
		
		
		
		
		
	}
}