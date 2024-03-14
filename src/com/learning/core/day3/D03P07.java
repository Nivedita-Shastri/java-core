package com.learning.core.day3;

public class D03P07 {
	public static void printSubSequence(String s, int index, String subString)
	{
        if (index >= s.length())
        {
            System.out.println(subString);
            return;
        }
 
        printSubSequence(s, index + 1, subString);
        subString += s.charAt(index);
        printSubSequence(s, index + 1, subString);
    }
 
    public static void main(String[] args) 
    {
        printSubSequence("abc", 0, "");
    }

}
