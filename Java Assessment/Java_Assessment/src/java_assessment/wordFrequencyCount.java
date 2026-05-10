package java_assessment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class wordFrequencyCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/Java Assessment/Java_Assessment/words.txt"));
			String line = "";
			while ((line = br.readLine()) != null) {
				String words[] = line.split(" ");
				for (String w : words) {
					if (map.containsKey(w)) {
						map.put(w, map.get(w) + 1);
					} else {
						map.put(w, 1);
					}
				}
			}
			br.close();
			for (String key : map.keySet()) {
				System.out.println(key + ":" + map.get(key));
			}
			System.out.println("Unique words:" + map.size());
		} catch (FileNotFoundException e) {
			System.out.println("Error: words.txt not found");
		}
	}

}
