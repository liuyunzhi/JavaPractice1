package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        String pattern = "([a-z])-(\\d+)";
        Pattern regex = Pattern.compile(pattern);
        for (String value : collectionA) {
            String key = value;
            Integer count = 1;
            if (value.length() != 1) {
                Matcher m = regex.matcher(value);
                if (m.find()) {
                    key = m.group(1);
                    count = Integer.valueOf(m.group(2));
                }
            }
            if (collection3.containsKey(key)) {
                count += collection3.get(key);
            }
            collection3.put(key, count);
        }
        for (String value : collection3.keySet()) {
            for (String val : object.get("value")) {
                if (value.equals(val)) {
                    int number = collection3.get(value) / 3;
                    collection3.put(value, (collection3.get(value) - number));
                    break;
                }
            }
        }
        return collection3;
    }
}
