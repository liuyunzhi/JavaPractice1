package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new HashMap<String, Integer>();
        for (String value : collectionA) {
            if (collection3.containsKey(value)) {
                Integer number = collection3.get(value) + 1;
                collection3.put(value, number);
            } else {
                collection3.put(value, 1);
            }
        }

        for (String value : collection3.keySet()) {
            for (String val : object.get("value")) {
                if (value == val) {
                    int count = collection3.get(value) / 3;
                    collection3.put(value,  collection3.get(value) - count);
                    break;
                }
            }
        }
        return collection3;
    }
}
