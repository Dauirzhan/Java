import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
                List<Country> countries = getCountry();
                List<City> cities = getCity();

                List<City> sorted = cities.stream()
                        .sorted(Comparator.comparing(City::getPopulation))
                        .collect(Collectors.toList());
                sorted.forEach(System.out::println);

                cities.stream()
                        .max(Comparator.comparing(City::getPopulation))
                        .ifPresent((System.out::println));

                List<Country> sorted1 = countries.stream()
                        .sorted(Comparator.comparing(Country::getCity))
                        .collect(Collectors.toList());
                sorted.forEach(System.out::println);

                countries.stream()
                        .max(Comparator.comparing(Country::getCity))
                        .ifPresent(System.out::println);
        }
        private static List<Country> getCountry(){
                return List.of(
                        new Country("Almaty", "Nur-Sultan", "Kazakhstan"),
                        new Country("Manchester", "London", "GreatBritain"),
                        new Country("Marsel", "Paris", "France"),
                        new Country("Milan>", "Rome", "Italy"),
                        new Country("Barcelona", "Madrid", "Spain")
                );
        }
        private static List<City> getCity(){
                return List.of(
                        new City(1,  2200000, "ALmaty", 5),
                        new City(2,  4800000, "Manchester", 1),
                        new City(3,  3500000,"Marsel", 5),
                        new City(4,  6100000,"Milan", 5),
                        new City(5,  5900000, "Barcelona", 5)
                );
        }

    /*static void Mymethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }
    static int plsm(int x, int y){
        return x + y;
    }
    static double plsm(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        Mymethod("Dauir", 21);
        int num1 = plsm(5,6);
        double num2 = plsm(4,8);
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);

        Scanner f = new Scanner(System.in);


    }
    public static int fib(int n){
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.println(n0 + " " + n1 + " ");
        for(int i = 2; i < n; i++){
            n2 = n0 + n1;
            System.out.println(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        return 0;

     */

}