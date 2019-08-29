package com.mer.strings.String_Charecter_Count;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringCharCount {

	public static void main(String arg[]) {
		LinkedHashMap<Character, Integer> strMap = checkNonRepeatChar("param");
		for (Entry<Character, Integer> entrySet : strMap.entrySet()) {
			System.out.println("KEY : " + entrySet.getKey() + "   VALUE : "
					+ entrySet.getValue());
		}
	}

	public static LinkedHashMap<Character, Integer> checkNonRepeatChar(String str) {
		LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (strMap.containsKey(ch)) {
				int value = strMap.get(ch);
				strMap.put(ch, ++value);
			} else {
				strMap.put(ch, 1);
			}
		}
		return strMap;
	}
}

//Output
//KEY : p   VALUE : 1
//KEY : a   VALUE : 2
//KEY : r   VALUE : 1
//KEY : m   VALUE : 1
