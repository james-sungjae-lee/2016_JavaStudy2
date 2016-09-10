import java.util.Scanner;

public class HW2_이성재 {

	public static void main(String[] args) {

		int year;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("연도를 입력하세요 : ");
		year = sc.nextInt();
				
		
		if(year%400 == 0){
			System.out.println("윤년입니다!");
			
		}else if(year%100 == 0){
			System.out.println("평년입니다!");
			
		}else if(year%4 == 0){
			System.out.println("윤년입니다!");
			
		}else{
			System.out.println("평년입니다!");
		}
		
		
	}

}
