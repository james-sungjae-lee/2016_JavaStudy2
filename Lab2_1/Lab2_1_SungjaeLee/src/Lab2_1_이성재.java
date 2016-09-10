import java.util.Scanner;

public class Lab2_1_이성재 {

	public static void main(String[] args) {

		// 동전 변수 지정
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
		
		System.out.println("정수를 입력하세요 : ");
		money = sc.nextInt();
		
		money50000 = money/50000;
		money = money-((money/50000)*50000);
		System.out.println("오만원권 "+money50000+"장");
		
		money10000 = money/10000;
		money = money-((money/10000)*10000);
		System.out.println("만원권 "+money10000+"장");
		
		money5000 = money/5000;
		money = money-((money/5000)*5000);
		System.out.println("오천원권 "+money5000+"장");
		
		money1000 = money/1000;
		money = money-((money/1000)*1000);
		System.out.println("천원권 "+money1000+"장");
		
		money500 = money/500;
		money = money-((money/500)*500);
		System.out.println("500원 동전 "+money500+"개");
		
		money100 = money/100;
		money = money-((money/100)*100);
		System.out.println("100원 동전 "+money100+"개");
		
		
		money10 = money/10;
		money = money-((money/10)*10);
		System.out.println("10원 동전 "+money10+"개");
		
		money1 = money/1;
		money = money-((money/1)*1);
		System.out.println("1원 동전 "+money1+"개 입니다!");
		

	}

}
