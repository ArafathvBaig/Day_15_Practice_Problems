package com.Day_15_Hash_Table;

public class MyLinkedHashMapMain 
{
	public static void main(String[] args) 
	{
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String sentence = "Paranoids are not paranoid because they are paranoid but"
						+ " because they keep putting themselves deliberately into"
						+ " paranoid avoidable situations";
		String words[] = sentence.toLowerCase().split(" ");
		for (String word: words)
		{
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
			{
				value = 1;
			}
			else
			{
				value = value+1;
			}
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		System.out.println("Frequency of Word 'paranoid' is: "+frequency);
	}
}
