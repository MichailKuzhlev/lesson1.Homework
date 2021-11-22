package ru.kuzhlev.lesson1.homework.lesson1;

public class homework {
    //Задание 1 создание метода main
    public static void main(String[] args) {

        //region задание 2 объявил и проинициализировал переменные
        byte sum01 = -41;
        short sum02 = -253;
        int sum03 = 123;
        long sum04 = 103232230899l;
        float sum05 = 2.14f;
        double sum06 = 2.54;
        char sum07 = 'i';
        boolean sum08 = false;
        String sum09 = "Моя строка";
        System.out.println("созданы переменные типа: \nbyte = " + sum01 + "\nshort = " + sum02 + "\nint = " + sum03 + "\nlong = " + sum04 + "\nfloat = " + sum05 + "\nshar = " + sum07 + "\nboolean = " + sum08 +"\nString = "+ sum09);
//endregion
        //region значание переменных и применение метода 3
        int a = 10;
        int b = 15;
        int c = 64;
        int d = 8;
        int res = calcilate(a, b, c, d);
        System.out.println("Выражение a * (b + (c / d))=" + res);
//endregion 33
        //region значение переменных и применение метода 4
        int x = 5;
        int y = 14;
        int sum11 = x + y;
        boolean res2 = metod4(x, y);
        System.out.println(res2);
//endregion
        //region значение переменных и применение метода 5
        int p = -2;
        int res3 = metod5(p);
        //endregion
        //region значение и применение метода 6
        int i = -32;
        boolean res4 = metod6(i);
        System.out.println(res4);
        //endregion
        //region значение и преминение метода 7
        String name ="Пётр";
        String res5 = metod7(name);
        //endregion
        //region Значение переменной и преминение метода 8
        int res8 = metod8(2020);
//endregion
    }
    //region Задание 3 метод вычисляющий a * (b + (c / d)).

    public static int calcilate(int a, int b, int c, int d) {
        int formula1 = a * (b + (c / d));
        return formula1;

    }
//endregion
    //region Задание 4 метод сравнивающий сумму двух чисел в диапазоне от 10-20.

    /**
     * 4 задание сравнение суммы 2х чисел в промежутке от 10 до 20
     *
     * @param x первое число
     * @param y второе число
     * @return сравнение суммы при помощи метода if и false
     */
    public static boolean metod4(int x, int y) {
        int sum11 = x + y;
        return sum11 >= 10 && sum11 <= 20;
    }//endregion
    //region Задание 5
    public static int metod5(int p) {
        if (p >= 0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");
        return p;

    }
    //endregion
    //region Задание 6 метод вовзвращающий true если число отрицательное и false если положительное
    public static boolean metod6(int i){
        int notornot = i;
        return notornot <0;
    }
    //endregion
    //region Задание 7 метод склеивающий строки имя + приветствие
    public static String metod7(String name) {
        System.out.println("Привет, " + name + "!");

        return name;
    }
    //endregion
    //region Задание 8 метод определеющий Високосный год или нет
    public static int metod8(int year){
       if(((year % 4 == 0)&&!(year % 100 == 0)) || (year % 400 ==0 ))
           System.out.println("Високосный год");
       else System.out.println("Не високосный год");
       return year;
    }
    //endregion
}