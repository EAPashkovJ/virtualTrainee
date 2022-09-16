package Utils;


import Model.City;

import java.util.*;

    /*
    Реализация сортировки списка городов по наименованию
    в алфавитном порядке по убыванию без учета регистра.
    */

public class Sort {

    public static List<City> sortByNameNaturalOrder(List<City> city) {
        city.sort(Comparator.comparing(City::toString));
        return city;
    }


    /*
    Сортировка списка городов по федеральному округу и наименованию города
    внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра.
     */

    public static List<City> sortByDistrictAndName(List<City> city) {

        //сортируем по полю name
        city.sort(Comparator.comparing(City::toString));

        // отсортированный массив сортиуем так же по полю District
        city.sort(Comparator.comparing(City::getDistrict));
        return city;

    }
}