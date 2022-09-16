import java.util.Scanner;

import static Utils.CityUtils.print;
import static Utils.CityUtils.readFile;
import static Utils.Sort.sortByDistrictAndName;
import static Utils.Sort.sortByNameNaturalOrder;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете действие, которое желаете совершить: ");
        System.out.println("1- вывести список городов");
        System.out.println("2- вывести отсротированный по имени список городов");
        System.out.println("3- вывести отсортированный по федеральному округу список городов");

        while (!sc.hasNextInt()) {
            sc.next();
        }
        int select = sc.nextInt();
        switch (select) {
            case 1 -> print(readFile());
            case 2 -> print(sortByNameNaturalOrder(readFile()));
            case 3 -> print(sortByDistrictAndName(readFile()));
            default -> System.out.println("Неверное значение!");
        }



        /*
        Вывод списка городов в консоль.
         */
        // print(readFile());

        /*
        Сортировка городов по имени.
         */
        //  print(sortByNameNaturalOrder(readFile()));

        /*
        Сортировка списка городов по федеральному округу и наименованию города.
         */
        //print(sortByDistrictAndName(readFile()));


    }
}



