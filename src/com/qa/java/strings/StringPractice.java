package com.qa.java.strings;

public class StringPractice {

	public static void main(String[] args) {

		String str = "hello how are you ";
		
		System.out.println(StringUtil.numberOfWords(str));
		
		
		String[] str1 = { "abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};


		StringUtil.emailValidation(str1);
	}
	
	

}
