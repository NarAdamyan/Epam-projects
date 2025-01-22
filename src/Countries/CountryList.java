package Countries;

import java.util.ArrayList;
import java.util.LinkedList;

public class CountryList {
    public static void main(String[] args) {
        Country armenia = new Country("Armenia", "Armenian", "Armenian Apostolic Church", "zinanshan", "redblueyellow", 2968000, 29743);
        Country russia = new Country("Russia", "Russian", "Russian Orthodox Church", "emblem4", "redbluewhite ", 146599183, 17098242.0);
        Country america = new Country("United States", "English", "Christianity", "emblem3", "redbluestarst ", 331002651, 9833517.0);
        Country USA = new Country("United States", "English", "Christianity", "emblem2", "redwhitestars ", 331002651, 9833517.0);
        Country england = new Country("Great Britain", "English", "Christianity", "emblem1", "redbluestar ", 67886011, 243610.0);

        LinkedList<Country> counties = new LinkedList<>();

        counties.add(armenia);
        counties.add(russia);
        counties.add(armenia);
        counties.add(america);
        counties.add(england);
        counties.add(england);
        counties.add(england);
        counties.add(america);
        counties.add(armenia);
        System.out.println(counties);
//        System.out.println(counties);
        UniqueCountriesViaOneList(counties);
//        CreateCountryList(counties, america);
//        CreateCountryList(counties, USA);
    }

    public static LinkedList<Country> CreateCountryList(LinkedList<Country> countries, Country el) {
        for (int i = 0; i < countries.size(); i++) {
            if ((countries.get(i).name.equals(el.name) ||
                    (countries.get(i).flagUrl.equals(el.flagUrl)) ||
                    (countries.get(i).emblemUrl.equals(el.emblemUrl)))){
                System.out.println(countries.get(i).name + "Already exist or have the same parametres as " + el.name);
                return countries;
            }
        }
        countries.add(el);
        return countries;
    }


    public static void UniqueCountries(LinkedList<Country> countries) {
        LinkedList<Country> unique = new LinkedList<>();
        for (Country el : countries) {
            if (!unique.contains(el)) {
                unique.add(el);
            }
        }
        System.out.println(unique);
    }

    public static void UniqueCountriesViaOneList(LinkedList<Country> countries) {
        for (int i = 0; i < countries.size(); i++) {
            for (int j = i + 1; j < countries.size(); j++) {
                if (countries.get(i).equals(countries.get(j))) {
                    countries.remove(j);
                    j--;

                }
            }
        }
        System.out.println(countries);
    }
}
