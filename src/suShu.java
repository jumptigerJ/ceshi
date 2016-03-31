import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class suShu {

	public static void main(String[] args) {
		int i,j;
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(i = 101;i < 200;i++){
			int test = 0;
			for(j = 1;j <= i;j++){
				if(i%j == 0){
					test ++;
				}
			}
			if(test == 2){
				sum ++;
				list.add(i);
			}	
		}
		System.out.println("101-200总共有"+sum+"个素数");
		System.out.print("分别是:");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
	}

}
