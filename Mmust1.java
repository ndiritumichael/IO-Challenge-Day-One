/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmust1;

import java.io.*;
import java.util.*;

public class Mmust1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        BufferedReader br = new BufferedReader(new FileReader(new File("a_example.txt")));
        String line = new String();
        int id =0;
        int numofwords = 0;
        int totalVowels = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        while ((line = br.readLine()) != null) {
        String[] words = null;
        int vowelCount = 0;
         words    = line.split(" ");
            id++;
            numofwords += words.length;
            
            for(String eachword1 : words){
                String eachword = eachword1.toLowerCase();
                for(int i=0; i < eachword.length(); i++){
                    
                    switch(eachword.charAt(i)){
                        
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            
                            vowelCount++;
                            break;
                        default:
                    }
                }
                
                
                
for (int i = 0; i < eachword.length(); i++) {
    char c = eachword.charAt(i);
    Integer val = map.get(c);
    if (val != null) {
        map.put(c, new Integer(val + 1));
    }
    else {
       map.put(c, 1);
   }
}
            }
            
            totalVowels += vowelCount;
        }
      
        System.out.println("Number of Lines "+ id);
        System.out.println("Number of Words "+ numofwords);
        System.out.println("Number of Vowels "+ totalVowels);
        
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        System.out.println("Frequency of \""+ entry.getKey() + "\"  is " + entry.getValue());
}

}
    
    
}
