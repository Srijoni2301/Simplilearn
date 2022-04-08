package com.simplilearn.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		System.out.println(c);
		
		while(c.find()) 
		{
			System.out.println(c.group(0));
		}
				
//		while(c.find()) {
//			System.out.println(check.substring(c.start(),c.end()));
//		}
	}
}


