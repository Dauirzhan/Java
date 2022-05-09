public class City {
    private final int id;
    private final String name;
    private final int CountryCode;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public int getPopulation() {
        return population;
    }

    private final int population;

    public City(int id, String name, int CountryCode, int population) {
        this.id = id;
        this.name = name;
        this.CountryCode = CountryCode;
        this.population = population;
    }
}
