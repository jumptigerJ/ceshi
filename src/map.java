import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		List<Integer> list5 = new ArrayList<Integer>();
		List<Integer> list6 = new ArrayList<Integer>();
		List<Integer> list7 = new ArrayList<Integer>();
		List<Integer> list8 = new ArrayList<Integer>();
		List<Integer> list9 = new ArrayList<Integer>();
		int[][] arr = new int[10][51];
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		

		for (int i = 0; i < 50; i++) {
			double d = Math.random();
			String s = String.valueOf(d);
			int num = Integer.parseInt(s.substring(2, 4));
			list.add(num);
			int key = num/10;
			if(key == 1){
				list1.add(num);
				map.put(key, list1);
			}if(key == 2){
				list2.add(num);
				map.put(key, list2);
			}if(key == 3){
				list3.add(num);
				map.put(key, list3);
			}if(key == 4){
				list4.add(num);
				map.put(key, list4);
			}if(key == 5){
				list5.add(num);
				map.put(key, list5);
			}if(key == 6){
				list6.add(num);
				map.put(key, list6);
			}if(key == 7){
				list7.add(num);
				map.put(key, list7);
			}if(key == 8){
				list8.add(num);
				map.put(key, list8);
			}if(key == 9){
				list9.add(num);
				map.put(key, list9);
			}
			
		
		}
		Iterator it = list.iterator();
		System.out.print("随机生成50个小于100的数，分别为：");
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
	
		System.out.println();
		System.out.print("Map中的数据为：");
		System.out.print("{");
		for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
			System.out.print(entry.getKey()+"=>"+entry.getValue()+",");
		}
		System.out.println("}");
		list1.sort(null);
		list2.sort(null);
		list3.sort(null);
		list4.sort(null);
		list5.sort(null);
		list6.sort(null);
		list7.sort(null);
		list8.sort(null);
		list9.sort(null);
		
	
		System.out.print("排序后的Map为：");
		System.out.print("{");
		for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
			System.out.print(entry.getKey()+"=>"+entry.getValue()+",");
		}
		System.out.println("}");
		
	}

}
