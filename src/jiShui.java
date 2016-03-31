import java.util.Scanner;

public class jiShui {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入工资：");
		int salary = Integer.parseInt(in.next());

		double money,tax = 0;
		money = salary - 3500;
		if(money >= 1500){
			tax = money * 0.03;
		}else if(money > 1500 && money <=4500){
			tax = money * 0.1;
		}else if(money > 4500 && money <=9000){
			tax = money * 0.2;
		}else if(money > 9000 && money <=35000){
			tax = money * 0.25;
		}else if(money > 35000 && money <=55000){
			tax = money * 0.3;
		}else if(money > 55000 && money <= 80000){
			tax = money * 0.35;
		}else if(money > 80000){
			tax = money * 0.45;
		}
		System.out.println("所需要缴纳的税费为："+ tax);
	}
}
