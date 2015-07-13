package q1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		map.put("CS390", new String[] { "renuka", "lerman" });
		map.put("MPP", new String[] { "corozza", "cam van" });
		map.put("DBMS", new String[] { "joe", "daren" });
		System.out.println("Key set of hash map: " + map.keySet());
		Collection<String[]> c = map.values();
		Iterator<String[]> itr = c.iterator();
		System.out.println("Values of hashmap are:");
		while (itr.hasNext()) {
			String[] arr = (String[]) itr.next();
			for (String p : arr) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		for (Map.Entry<String, String[]> entry : map.entrySet()) {
			System.out.printf("[ Key :-> %s ", entry.getKey());
			String[] arr = (String[]) entry.getValue();
			System.out.print("Values :->");
			for (String p : arr) {
				System.out.print(p + " ");
			}
			System.out.println("]");
		}

	}
}
// OUTPUT
// ===============================================
// Key set of hash map: [DBMS, CS390, MPP]
// Values of hashmap are:
// joe daren
// renuka lerman
// corozza cam van
// [ Key :-> DBMS Values :->joe daren ]
// [ Key :-> CS390 Values :->renuka lerman ]
// [ Key :-> MPP Values :->corozza cam van ]

