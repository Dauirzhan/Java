import java.util.List;

public class Country {
    private static List<City> getCity() {
        return List.of(
                new City(1, "London", 1, 11_000_000),
                new City(1, "Bayern", 6, 8_000_000),
                new City(1, "Tokyo", 10, 30_000_000),
                new City(1, "Madrid", 8, 1_600_000),
                new City(1, "Milan", 7, 4_000_000),
                new City(1, "Almaty", 5, 2_100_000),
                new City(1, "Melburn", 3, 18_000_000)

        );

    }
}
