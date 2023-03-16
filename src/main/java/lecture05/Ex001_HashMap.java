package lecture05;

import java.util.Map;
import java.util.HashMap;

public class Ex001_HashMap {
    public static void main(String[] args) {
//        в HashMap элементы располагаются как угодно и могут менять своё расположение
//        Уникальные ключи
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(44));
//        db.remove(null);
        System.out.println(db);
        System.out.println(db.containsValue("один"));
//        System.out.println(db.containsValue(1));
//        System.out.println(db.containsKey("один"));
        System.out.println(db.containsKey(1));
        System.out.println(db.keySet());
        System.out.println(db.values());
    }
}
