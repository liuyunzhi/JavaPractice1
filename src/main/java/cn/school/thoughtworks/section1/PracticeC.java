package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> ruselt = new ArrayList<String>();
        for (String value : collection1) {
            for (String val : collection2.get("value")) {
                if (value == val) {
                    ruselt.add(value);
                    break;
                }
            }
        }
        return ruselt;
    }
}
