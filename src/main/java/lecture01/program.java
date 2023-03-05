package lecture01;

public class program {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        String s = "Hello world";
//        System.out.println(s);

//        float f = 123.45f;
//        System.out.println(f);
//        double d = 123.45D;
//        System.out.println(d);

//        char ch = '{';
//        System.out.println(ch);
////        номер символа { - 125
//        char ch1 = 125;
//        System.out.println(ch1);

//        int a = 13;
//        double d = a;

////        конъюнкция
//        boolean or = true || false;
//        System.out.println(or);
////        дизъюнкция
//        boolean and = true && false;
//        System.out.println(and);
////        Разделительная дизъюнкция
//        boolean f = true ^ false;
//        System.out.println(f);
////        инверсия
//        boolean inversion= !false;
//        System.out.println(f);

//        var i = 123;
//        System.out.println(getType(i));
//        char ch = 123;
//        System.out.println(getType(ch))

//        int i = 2_312_334;
//        System.out.println(i);
//        System.out.println(Integer.MIN_VALUE);

//        String s = "qwer";
//        System.out.println(s.charAt(1));

//        int a = 123;
////        a++;
////        System.out.println(a++);
//        System.out.println(++a);
//        System.out.println(a);

//        int a = 123;
////        в a-- отбавляем от a 1, при этом значение a-- остаётся неизменно 123
////        на момент --a значение a = 122, отнимаем 1 и значение --a получается 121
////        в итоге выражение равно 123 - 121
//        a = a-- - --a;
//        System.out.println(a);
//        a = 123;
//        System.out.println(a--);
//        System.out.println(--a);
//        a = 123;
//        int a1 = a--;
//        int a2 = --a;
//        System.out.println(a1);
//        System.out.println(a2);

//        boolean f = 123 > 234;
//        System.out.println(f);
//        f = 123 <= 234;
//        System.out.println(f);
//        f = 123 != 234;
//        System.out.println(f);

//        int a = 8;
////        1000
//        System.out.println(a << 1);
////        10000

//        int a = 18;
//////        10010
//        System.out.println(a >> 1);
//////        1001

//        int a = 5;
//        int b = 2;
//        System.out.println(a | b);
////        101
////        010
////        ИЛИ
////        111

//        int a = 5;
//        int b = 2;
//        System.out.println(a & b);
////        101
////        010
////         И
////        000

//        int a = 5;
//        int b = 2;
//        System.out.println(a ^ b);
////        101
////        010
////        111

//        boolean a = True;
//        boolean b = True;
//        System.out.println(a & b);
////        быстрая операция &&
//        System.out.println(a && b);

//        String s = "qwer"; // 4, 0..3
//        boolean b = s.length() >= 5 && s.charAt(4) == '1';
//        System.out.println(b);
//        s = "qwer1";
//        b = s.length() >= 5 && s.charAt(4) == '1';
//        System.out.println(b);

//        String s = "qww1";
////        быстрая операция && проверяет только первое условие. т.к. оно false, уже нет смысла проверять второе
//        boolean b = s.length() >= 5 && s.charAt(4) == '1';
//        System.out.println(b);
////        & проверяет оба условия в любом случае
//        b = s.length() >= 5 & s.charAt(4) == '1';
//        System.out.println(b);

//        String s = "qww1";
////        быстрая операция || проверяет только первое условие. т.к. оно true, уже нет смысла проверять второе
//        boolean b = s.length() <= 5 || s.charAt(4) == '1';
//        System.out.println(b);
////        | проверяет оба условия в любом случае
//        b = s.length() <= 5 | s.charAt(4) == '1';
//        System.out.println(b);

//        Массивы
//        int[] arr = new int[10];
//        System.out.println(arr.length); // 10
//        arr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(arr.length); // 5

//        int[] int_arr = new int[10];
//        System.out.println(int_arr[3]); // 0
//        int_arr[3] = 13;
//        System.out.println(int_arr[3]);
//
//        boolean[] bool_arr = new boolean[10];
//        System.out.println(bool_arr[3]); // false
//        bool_arr[3] = true;
//        System.out.println(bool_arr[3]);

//        Многомерные массивы
//        int[][] arr = new int[3][5];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ", arr[i][j]);
//            }
//            System.out.println();
//        }

//        byte b = Byte.parseByte("12");
//        System.out.println(b);

////        Переполнение байта
//        byte b = Byte.parseByte("1211");
//        System.out.println(b);

////        Получение данных из терминала
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Представьтесь: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Здравствуйте, %s!", name);
//        iScanner.close();

//        Проверка на соответствие получаемого типа
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        boolean flag = iScanner.hasNextInt();
//        if (flag) {
//            System.out.println(iScanner.nextInt());
//        } else {
//            System.out.println("Введены неверные данные");
//        }
//        iScanner.close();

////        Форматированный вывод
////        Конкатенация
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = a + " + " + b + " = " + c;
//        System.out.println(res);

//        String a = "qwe";
//        int b = 123;
//        String res = a+b;
//        System.out.println(res);

//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c );
//        System.out.print(res);
//        System.out.printf("%d + %d = %d \n", a, b, c);

//        lib.sayHi();

////        Оператор выбора
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Номер месяца: ");
//        int month = Integer.parseInt(iScanner.nextLine());
//        String text = "Время года: ";
//        switch (month) {
//            case 12,1,2:
//                text += "Зима";
//                break;
//            case 3,4,5:
//                text += "Весна";
//                break;
//            case 6,7,8:
//                text += "Лето";
//                break;
//            case 9,10,11:
//                text += "Осень";
//                break;
//            default:
//                text = "Неверно введён номер месяца";
//        }
//        switch (month) {
//            case 12, 1, 2 -> text += "Зима";
//            case 3, 4, 5 -> text += "Весна";
//            case 6, 7, 8 -> text += "Лето";
//            case 9, 10, 11 -> text += "Осень";
//            default -> text = "Неверно введён номер месяца";
//
//        System.out.println(text);
//        iScanner.close();

////        цикл while
//        int value = 321;
//        int count = 0;
//        int a = value;
//        while (a!= 0) {
//            a/= 10;
//            count++;
//        }
//        System.out.println("В числе " + value + " цифр: " + count);

////        цикл с постусловием do While
//        int value = 321;
//        int count = 0;
//        int a = value;
//        do {
//            a /= 10;
//            count++;
//        }
//        while (a != 0);
//        System.out.println("В числе " + value + " цифр: " + count);

////        break, continue в цикле for
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) continue;
//            System.out.println(i);
//        }

//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Кол-во строк: ");
//        int rows = Integer.parseInt(iScanner.nextLine());
//        System.out.print("Кол-во колоннок: ");
//        int columns = Integer.parseInt(iScanner.nextLine());
//        for (int i = 0; i <= rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (i % 2 == 0)
//                    break;
//                System.out.print("*");
//            }
//            if (i % 2 == 1 && i != (rows % 2 == 0 ? rows - 1 : rows))
//                System.out.println("\n*" + " ".repeat(columns - 2) + "*");
//        }
//        iScanner.close();

//        for each - перебор элементов
//        int[] arr = new int[]{1, 2, 3, 4, 5, 77};
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }
//        System.out.println();
//        for (int item : arr) {
//            item = 0;
//        }
////        Не работает с элементами массива
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}