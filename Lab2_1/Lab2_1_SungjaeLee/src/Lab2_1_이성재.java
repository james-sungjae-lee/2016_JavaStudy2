import java.util.Scanner;

public class Lab2_1_�̼��� {

	public static void main(String[] args) {

		// ���� ���� ����
		int money;
		int money1;
		int money10;
		int money50;
		int money100;
		int money500;
		int money1000;
		int money5000;
		int money10000;
		int money50000;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		money = sc.nextInt();
		
		money50000 = money/50000;
		money = money-((money/50000)*50000);
		System.out.println("�������� "+money50000+"��");
		
		money10000 = money/10000;
		money = money-((money/10000)*10000);
		System.out.println("������ "+money10000+"��");
		
		money5000 = money/5000;
		money = money-((money/5000)*5000);
		System.out.println("��õ���� "+money5000+"��");
		
		money1000 = money/1000;
		money = money-((money/1000)*1000);
		System.out.println("õ���� "+money1000+"��");
		
		money500 = money/500;
		money = money-((money/500)*500);
		System.out.println("500�� ���� "+money500+"��");
		
		money100 = money/100;
		money = money-((money/100)*100);
		System.out.println("100�� ���� "+money100+"��");
		
		
		money10 = money/10;
		money = money-((money/10)*10);
		System.out.println("10�� ���� "+money10+"��");
		
		money1 = money/1;
		money = money-((money/1)*1);
		System.out.println("1�� ���� "+money1+"�� �Դϴ�!");
		

	}

}
