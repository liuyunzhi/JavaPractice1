package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> ruselt = new HashMap<String, Integer>();
        String pattern = "([a-z])-(\\d+)";
        Pattern regex = Pattern.compile(pattern);
        for (String value : collection1) {
            String key = value;
            Integer number = 1;
            if (value.length() != 1) {
                Matcher m = regex.matcher(value);
                if (m.find()) {
                    key = m.group(1);
                    number = Integer.valueOf(m.group(2));
                }
            }
            if (ruselt.containsKey(key)) {
                number += ruselt.get(key);
            }
            ruselt.put(key, number);
        }
        return ruselt;
    }
}
