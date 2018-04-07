package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> ruselt = new HashMap<String, Integer>();
        for (String value : collection1) {
            String key = value;
            Integer number = 1;
            if (value.length() != 1) {
                char[] temp = value.toCharArray();
                key = String.valueOf(temp[0]);
                String tempStr = "";
                for (int i = 2; i < temp.length; i++) {
                    try{
                        Integer tempInt = Integer.parseInt(String.valueOf(temp[i]));
                        if (0 <= tempInt && tempInt <= 9) {
                            tempStr += temp[i];
                        }
                    }catch(NumberFormatException e){
                        break;
                    }
                }
                number = Integer.valueOf(tempStr);
            }
            if (ruselt.containsKey(key)) {
                number += ruselt.get(key);
            }
            ruselt.put(key, number);
        }
        return ruselt;
    }
}
