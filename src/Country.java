import java.util.ArrayList;
import java.util.List;

public class Country {
    String city, capital, country;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Country(String country) {
        this.country = country;
    }

    private List<City> citiesList = new ArrayList<>();

    public Country(String city, String capital, String country, List<City> citiesList) {
        this.city = city;
        this.capital = capital;
        this.country = country;
        this.citiesList = citiesList;
    }

    Country(String city, String capital, String country) {
        this.city = city;
        this.capital = capital;
    }

    public String getCity() {
        return city;
    }

    public String getCapital() {
        return capital;
    }

    public List<City> getCitiesList() {
        return citiesList;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCitiesList(List<City> citiesList) {
        this.citiesList = citiesList;
    }

}

class City {
    private int id;
    private int population;
    private String name;
    private int CountryCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(int countryCode) {
        CountryCode = countryCode;
    }

    public City(int id, int population, String name, int countryCode) {
        this.id = id;
        this.population = population;
        this.name = name;
        this.CountryCode = countryCode;
    }
}
