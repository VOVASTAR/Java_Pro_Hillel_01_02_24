package lectures.string;

import java.util.ArrayList;
import java.util.List;

public class ChangeListData {

    public static void main(String[] args) {
        List<String> testStrs = new ArrayList<>();
        testStrs.add("a");
        testStrs.add("removeMe");
        changeList(testStrs);
        System.out.println(testStrs);
    }

    private static void changeList(List<String> strings) {
        strings.add("b");
        strings.add("c");
        strings.remove("removeMe");
        strings = new ArrayList<>();
        strings.add("d");
        strings.add("e");
        System.out.println(strings);
    }
}
