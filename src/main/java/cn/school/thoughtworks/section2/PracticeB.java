package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> ruselt = new HashMap<String, Integer>();
        for (String value : collection1) {
            String key = value;
            Integer number = 1;
            if (value.length() != 1) {
                char[] temp = value.toCharArray();
                key = String.valueOf(temp[0]);
                number = Integer.parseInt(String.valueOf(temp[2]));
            }
            if (ruselt.containsKey(key)) {
                number += ruselt.get(key);
            }
            ruselt.put(key, number);
        }
        return ruselt;
    }
}
