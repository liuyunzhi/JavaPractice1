package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String value : collectionA.keySet()) {
            for (String val : object.get("value")) {
                if (value == val) {
                    int count = collectionA.get(value) / 3;
                    collectionA.put(value,  collectionA.get(value) - count);
                    break;
                }
            }
        }
        return collectionA;
    }
}
