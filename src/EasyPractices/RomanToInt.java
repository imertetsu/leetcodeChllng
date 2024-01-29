package EasyPractices;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character, Integer> list = new HashMap<>();
        list.put('M', 1000);
        list.put('D', 500);
        list.put('C', 100);
        list.put('L', 50);
        list.put('X', 10);
        list.put('V', 5);
        list.put('I', 1);
        int result = 0;
        if(s.length() == 1){
            return list.get(s.charAt(0));
        }

        for (int i = 0; i < s.length()-1; i++){
            if (list.get(s.charAt(i)) < list.get(s.charAt(i+1))){
                result += list.get(s.charAt(i+1)) - list.get(s.charAt(i));
                i++;
                if(i == s.length()-2){
                    result += list.get(s.charAt(i+1));
                }
            }else {
                if(i == s.length()-2){
                    result += list.get(s.charAt(i+1));
                }
                result += list.get(s.charAt(i));
            }
        }
        return result;
    }
}
