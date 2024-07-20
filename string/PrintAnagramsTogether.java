package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramsTogether {
     public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String , List<String>> map = new HashMap<>();

        for(int i=0; i<string_list.length; i++){
            char[] ch = string_list[i].toCharArray();
            Arrays.sort(ch);
            String newStr = new String(ch);

            if(!map.containsKey(newStr)){
                map.put(newStr, new ArrayList<>());
            }
            map.get(newStr).add(string_list[i]);
        }
        return new ArrayList<>(map.values());
    }
}

