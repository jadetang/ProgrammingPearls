package dudu.pp.chapter2;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author tangsicheng
 * @version 1.0
 * @since 1.0
 */
public class Anagram {
    /**
     * find all anagram set of input words
     *
     * @param words
     * @return
     */
    public static Collection<Collection<String>> anagram(List<String> words) {
        LinkedListMultimap<Integer,String> result = LinkedListMultimap.create();
        for (String word : words) {
            result.put(signature(word),word);
        }
        return result.asMap().values();
    }


    /**
     * return a signature of a word ignore case,if the two words are anagram,then
     * their signatures are same.For example, cat,tat,Cat signatures are same.
     *
     * @param word
     * @return
     */
    private static Integer signature(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars).hashCode();
    }


    public static void main(String[] args) throws IOException {
        File dictionary  = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\dictionary-shakespeare.txt");
        Reader reader = new FileReader(dictionary);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = null;
        List<String> words = Lists.newLinkedList();
        while( (line = bufferedReader.readLine() ) !=null ){
            words.add(line);
        }
        Collection<Collection<String>> anagram = anagram(words);
        for(Collection c:anagram){
            System.out.println(c);
        }


    }


}
