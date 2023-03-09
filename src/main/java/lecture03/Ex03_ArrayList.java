package lecture03;

import java.util.ArrayList;

public class Ex03_ArrayList {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(2809);
//        list.add("A");
//
//        for (Object o : list) System.out.println(o);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2809);

        for (Integer o : list) System.out.println(o);

//        Разные способы создания
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(10);
//        ArrayList<Integer> list4 = new ArrayList<>(list3);
    }
}
