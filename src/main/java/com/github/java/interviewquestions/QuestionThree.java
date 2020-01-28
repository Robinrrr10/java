package com.github.java.interviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QuestionThree {

	// input = [a, h, l, a, n, l, q, a]
	// output = a=3, h=1, l=2, n=1, q=1 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> allChars = Arrays.asList('a', 'h', 'l', 'a', 'n', 'l', 'q', 'a');
		
		Set<Character> uniqChars = new HashSet<Character>();
		for(int i=0; i< allChars.size(); i++) {
			uniqChars.add(allChars.get(i));
		}
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		
		for(Character ch : uniqChars) {
			int count = 0;
			for(int i=0; i< allChars.size(); i++) {
				if(allChars.get(i) == ch)
					count ++;
			}
			maps.put(ch, count);
		}
		
		System.out.println(maps);
		
		for(Map.Entry<Character, Integer> val : maps.entrySet()) {
			System.out.print(val.getKey()+"="+val.getValue()+" ");
		}

	}

}
