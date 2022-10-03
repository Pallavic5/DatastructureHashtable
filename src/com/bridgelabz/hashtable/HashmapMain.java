package com.bridgelabz.hashtable;

public class HashmapMain {

	public static void main(String[] args) {

		HashmapMain main = new HashmapMain();
		main.givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency();
		main.givenSentence_whenWordsAreAddedToList_shouldReturnParanoidWordFrequency();

	}

	public void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To Be or not To be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
				myHashMap.add(word, value);
		}
		System.out.println(myHashMap);
		int frequency = myHashMap.get("to");
		System.out.println("frequency = " + frequency);
	}

	public void givenSentence_whenWordsAreAddedToList_shouldReturnParanoidWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myLinkedHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value += 1;
			myLinkedHashMap.add(word, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println("frequency = " + frequency);
	}

}
