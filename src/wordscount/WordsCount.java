/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscount;

/**
 *
 * @author Lucas
 */
public class WordsCount {

	public int wordsCount(String[] words, int len) {
	    int count = 0;
	    for (int i = 0; i < words.length; i++) {
	        if (words[i].length() == len) count++;
	    }
	    return count;
	}
        
    public static void main(String[] args) {
	WordsCount print = new WordsCount();
	System.out.println(print.wordsCount( new String[] {"a", "bb", "b", "ccc"}, 2));
    }
    
}
