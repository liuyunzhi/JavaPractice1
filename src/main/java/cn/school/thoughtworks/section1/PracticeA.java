package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> ruselt = new ArrayList<String>();
        for (String value : collection1) {
            for (String val : collection2) {
                if (value == val) {
                    ruselt.add(value);
                    break;
                }
            }
        }
        return ruselt;
    }
}
