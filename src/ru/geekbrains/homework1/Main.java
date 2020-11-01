package ru.geekbrains.homework1;

public class Main {
    public static void main(String[] args) {

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        double a=1;
        int b=2;
        char d='3';
        boolean e=false;
        String p = "Привет";
        float h =12.34f;
        long l = 82856987L;
        double E = 2.71828182845905;
        short s = 111;
        byte bt=0;

        checkRange(5,21);
        positiveOrNegative(-8);
        printName("Пётр");
        isLeapYear(2020);
    }
    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    private static double calculate(float a, float b, float c, float d) {
        System.out.println("\nЗадание 2.");
        return a * (b + (c / d));
    }
   //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     private static boolean checkRange(int a, int b) {
       int sum = a + b;
       if (sum > 10 && sum <= 20) {

           return true;
       }
       else {
           return false;
       }

   }
   //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     private static void positiveOrNegative(int a) {
       if (a >= 0) System.out.println("Число " + a + "положительное");
       else System.out.println("Число " + a + " отрицательное");
   }
   //6.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
       private static boolean checkIfNegative(int a) {
       if (a < 0) return true;
       return false;
   }
   //7.Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
      private static void printName(String name) {
       System.out.println("Привет, " + name + "!");
   }
   // 8.Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void isLeapYear(int year) {
       if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
       else System.out.println(year + " г. високосный");
   }
}
