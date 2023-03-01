import javax.xml.parsers.SAXParser;

public class Main {
    public static void main(String[] args) {

        //задача1


        for (int i = 1; i < 10; i = i + 1)
            System.out.println(i);
        //задача2

        for (int y = 10; y > 1; y = y - 1)
            System.out.println(y);
        //задача3

        for (int f = 0; f <= 17; f = f + 2)
            System.out.println(f);
        //задача 4

        for (int t = -10; t <= 10; t = t + 10)
            System.out.println(t);


        //задача 5
        for (int i = 1904; i <= 2094; i = i + 4)
            System.out.println(i + "год является високосным».");

        //задача6
        for (int i = 7; i <= 98; i = i + 7)
            System.out.println(" последовательность чисел" + i);

        //задача 7
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println("последовательность чисел " + i);

        //задача 8
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
        }
        System.out.println("Месяц " + salary + " сумма накоплений равна " + total + "рублей».");

        //задача 9
        int salaryTwoo = 29000;
        int totalTwoo = 0;
        for (int t = 0; t < 12; t++) {
            totalTwoo = totalTwoo + totalTwoo / 100;
            totalTwoo = totalTwoo + salaryTwoo;
        }
        System.out.println("Месяц " + salaryTwoo + " сумма накоплений равна " + totalTwoo + "  рублей».");

        //задача 10
        for (int t = 2; t < 22; t=t + 2) {
                System.out.println(t);
            }



        }
    }

