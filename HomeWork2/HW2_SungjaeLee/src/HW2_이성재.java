import java.util.Scanner;

public class HW2_�̼��� {

	public static void main(String[] args) {

		int year;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		year = sc.nextInt();
				
		
		if(year%400 == 0){
			System.out.println("�����Դϴ�!");
			
		}else if(year%100 == 0){
			System.out.println("����Դϴ�!");
			
		}else if(year%4 == 0){
			System.out.println("�����Դϴ�!");
			
		}else{
			System.out.println("����Դϴ�!");
		}
		
		
	}

}
