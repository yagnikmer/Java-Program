package com.mer.strings.String_Non_Repeat_Char;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StringNonRepeadChar {

	public static void main(String arg[]) {
		checkNonRepeatChar("param");
	}

	public static void checkNonRepeatChar(String str) {
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
		System.out.print("Non Repeated Char  : ");
		for (Entry<Character, Integer> entrySet : strMap.entrySet()) {
			if (entrySet.getValue() == 1)
				System.out.print(entrySet.getKey());
		}
		System.out.println();
	}
}

//Output
//Non Repeated Char  : prm