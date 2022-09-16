import static Utils.CityUtils.print;
import static Utils.CityUtils.readFile;
import static Utils.Sort.sortByDistrictAndName;
import static Utils.Sort.sortByNameNaturalOrder;


public class Main {

    public static void main(String[] args) {


        /*
        Вывод списка городов в консоль.
         */
         print(readFile());

        /*
        Сортировка городов по имени.
         */
        print(sortByNameNaturalOrder(readFile()));

        /*
        Сортировка списка городов по федеральному округу и наименованию города.
         */
        print(sortByDistrictAndName(readFile()));


    }
}



