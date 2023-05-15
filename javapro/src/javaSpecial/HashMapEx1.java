package javaSpecial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("È«±æµ¿", 90);
		map.put("±èÃ¶¼ö", 80);
		map.put("ÀÌ¿µÈñ", 70);
		map.put("¹ÚÂùÈ£", 36);
		map.put("¼ÕÈï¹Î", 7);
		System.out.println("ÃÑ ÀÚ·á¼ö : "+map.size());
		System.out.println(map.get("¼ÕÈï¹Î"));
		System.out.println(map.get(7));
		map.remove("±èÃ¶¼ö");
		//HashMap µ¥ÀÌÅÍ¸¦ keyset¸Ş¼­µå Ã³¸®
		/*Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}*/
		//HashMap µ¥ÀÌÅÍ¸¦ entrySet¸Ş¼­µå Ã³¸®
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator(); 
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
