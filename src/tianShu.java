import java.util.Scanner;

public class tianShu {

	public static void main(String[] args) {
		System.out.println("请输入日期");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		int tian = 0;
		int sum = 0;
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		
		for(int m = 0;m < month; m++)
		switch(m){
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  case 12:
			  tian += 31;
			  break;
		  case 4:
		  case 6:
		  case 9:
		  case 11:
			  tian += 30;
			  break;
		  case 2:
			  if((year % 4 == 0) || (year % 100 ==0) && (year % 400 == 0)){
				  tian += 29;
			  }else{
				  tian += 28;
			  }
			  break;
			  default:
				  tian = 0;
		}
		sum = tian + day;
	System.out.println("你输入的日期为当年的第"+sum +"天");
		
		
	}
	
}
