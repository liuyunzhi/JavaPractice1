package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> ruselt = new HashMap<String, Integer>();
        for (String value : collection1) {
            if (ruselt.containsKey(value)) {
                Integer number = ruselt.get(value) + 1;
                ruselt.put(value, number);
            } else {
                ruselt.put(value, 1);
            }
        }
        return ruselt;
    }
}
