package Session;

import java.util.*;

class employeee {
	String eid;
	String ename;
	double esal;

	public employeee(String eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "eid = " + eid + "\tename = " + ename + "\tesal=" + esal;
	}

}

public class Program_11_MapInterface {
	public static void main(String[] args) {

		Map<String, employeee> firstMap = new HashMap<String, employeee>();
		firstMap.put("2", new employeee("2", "Aaaaa", 11111));
		firstMap.put("1", new employeee("1", "Bbbbb", 55000));
		firstMap.put("4", new employeee("4", "Ccccc", 60000));
		firstMap.put("6", new employeee("6", "Ddddd", 13000));
		firstMap.put("3", new employeee("3", "Eeeee", 35000));
		firstMap.put("5", new employeee("5", "Fffff", 10000));
	
		TreeMap<String, employeee> sorted = new TreeMap<String, employeee>(firstMap);

		Iterator<String> it = sorted.keySet().iterator();
		System.out.println("Sorted value of map");
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " " + firstMap.get(key));
		}

		Iterator<String> itr = firstMap.keySet().iterator();

		while (itr.hasNext()) {
			String key = (String) itr.next();

			employeee sal = firstMap.get(key);

			if (sal.esal < 15000.0) {
				itr.remove();

			}
		}

		Map<String, employeee> finalMap = new HashMap<String, employeee>();
		for (Map.Entry<String, employeee> entry : firstMap.entrySet()) {
			finalMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("\n");
		System.out.println("Value of new Map after removing the employees having salary less than 15000");
		Iterator<String> itr1 = finalMap.keySet().iterator();
		while (itr1.hasNext()) {
			String key = (String) itr1.next();
			System.out.println(key + " " + firstMap.get(key));
		}
		firstMap.clear();
		sorted.clear();
		finalMap.clear();
	}

}