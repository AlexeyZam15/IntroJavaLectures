package lecture05;

import java.util.HashMap;
import java.util.Map;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
//  Ускорение работы - установка нужного размера изначально
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>(9);
//  loadFactor = 1.0f -  увеличивать размер, только когда заполнится на 100%
        Map<Integer, String> map3 = new HashMap<>(9, 1.0f);
    }
}
