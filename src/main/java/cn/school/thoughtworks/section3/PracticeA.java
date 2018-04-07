package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String value : collectionA.keySet()) {
            for (String val : object.get("value")) {
                if (value == val) {
                    collectionA.put(value, collectionA.get(value) - 1);
                    break;
                }
            }
        }
        return collectionA;
    }
}
