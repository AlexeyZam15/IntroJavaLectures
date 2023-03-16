package lecture05;

import java.util.TreeMap;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1,"один");
        System.out.println(tMap);
        tMap.put(6,"шесть");
        System.out.println(tMap);
        tMap.put(4,"четыре");
        System.out.println(tMap);
        tMap.put(3, "три");
        System.out.println(tMap);
        tMap.put(2,"два");
        System.out.println(tMap);
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
    }
}
