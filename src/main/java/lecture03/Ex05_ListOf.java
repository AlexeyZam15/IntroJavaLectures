package lecture03;
import java.util.ArrayList;
import java.util.List;

public class Ex05_ListOf {
    public static void main(String[] args) {
        Character value = null;
//        List<Character> list1 = List.of('A','l','e','x','e','y');
        List<Character> list1 = new ArrayList<Character>();
        list1.add('A'); list1.add('l'); list1.add('e'); list1.add('x'); list1.add('e');list1.add('y');
        System.out.println(list1);
        // c List.of нельзя удалять элементы
        list1.remove(1);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list1);

    }
}
