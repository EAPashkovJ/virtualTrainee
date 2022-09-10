package Utils;

import Model.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CityUtils {

    /*
    Метод parseList производит чтение файла и добавление его в ArrayList
     */
    public static List<City> readFile() {
        List<City> cities = new ArrayList<>();

        // Путь к файлу вынесен отдельно
        String filePath = "src/main/resources/readFile/city_ru.csv";

        Scanner scanner;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNextLine()) { // Обработка данных и заполнение массива
            cities.add(parse(scanner.nextLine()));
        }
        scanner.close(); // Не забываем вызвать метод закрытия потока данных

        return cities;
    }


    /*
    Парсим прочитанную строку в модель
     */
    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        City city = new City();

        // Сопоставляем поля с моделью City
        while (scanner.hasNextLine()) {
            String[] arr = scanner.nextLine().split(";");

            city.setName(arr[1]);
            city.setRegion(arr[2]);
            city.setDistrict(arr[3]);
            city.setPopulation(Integer.valueOf(arr[4]));
            city.setFoundation(arr.length >= 6 ? arr[5] : "else");


            System.out.println(city);

        }
        // закрываем scanner после вычитывания файла
        scanner.close();
        return city;
    }

    /*
    Метод  print проходит через весь лист городов и выводит данные в консоль
     */
    public static void print(List<City> cities) {
        cities.forEach(System.out::println);
    }

}