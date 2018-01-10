package by.dbarkova.runner;

import java.util.Arrays;

public class MainApp4 {

	public static void main(String[] args) {
		// гл. 7, вар. А, задание 9
		// Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.. (используя String)
		
		
		String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet.";
        System.out.println(s);
		String s1 = s.replace('.', ' ');
		String s2 = s1.replace(',', ' ');
		System.out.println(s2);
		
		String[] words = s2.split(" ");
		
		Arrays.sort(words);
		
		for(String word : words) {
			System.out.println("word is " + word);
			
			String[] wordsUnique = new String[10];
			
			int c = 0;
			
			for(int i = 0; i < words.length; i++) {
				if(i == words.length - 1) {
					wordsUnique[c] = words[i];
				}else if(!words[i].equals(" ") && !words[i].equals(words[i + 1])) {
					wordsUnique[c] = words[i];
					c = c + 1;
				}
			}
			
			for(String wordUnique : wordsUnique) {
				System.out.println("Unique word is: " + wordUnique);
			}
			
		}	
		
	}

}
