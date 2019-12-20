import java.util.HashMap;
import java.util.Map;

/**
 * @author Nawin
 * @category HashMap
	Java HashMap class contains values based on the key.
	Java HashMap class contains only unique keys.
	Java HashMap class may have one null key and multiple null values.
	Java HashMap class is non synchronized.
	Java HashMap class maintains no order.
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "nawin");
		map.put(2, "pranay");
		map.put(3, "dhruva");
		
		
		
//		map.put(null, null);
//		map.put(4, null);
//		map.put(5, null);

		// using java8 forEach
		map.forEach((k, v) -> System.out.println(k + " " + v));

		// using stream
//		map.entrySet().stream().forEach(k -> System.out.println(k.getKey() + " " + k.getValue()));
//
//		// using entrySet
//		for (Map.Entry<Integer, String> entry : map.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//		}
//		
//		//using Keyset
//		for (Integer key : map.keySet()) {
//		      System.out.println("Key : " + key + " value : " + map.get(key));
//		    }

	}

}
