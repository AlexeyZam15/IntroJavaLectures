package lecture03;

import java.util.Arrays;
import java.util.List;

public class Ex04_ArraysMethod {
    public static void main(String[] args) {
//        int day = 29;
//        int month = 9;
//        int year = 1998;
//        Integer[] date = { day, month, year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1998");
        StringBuilder[] date = new StringBuilder[] { day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);
    }
}
