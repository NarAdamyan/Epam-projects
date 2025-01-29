package Countries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountryList {
    public static void main(String[] args) {
        Country armenia = new Country("Armenia", "Armenian", "Armenian Apostolic Church", "zinanshan", "redblueyellow", 2968000, 29743);
        Country russia = new Country("Russia", "Russian", "Russian Orthodox Church", "emblem4", "redbluewhite ", 146599183, 17098242.0);
        Country america = new Country("United States", "English", "Christianity", "emblem3", "redbluestarst ", 331002651, 9833517.0);
        Country USA = new Country("United States", "English", "Christianity", "emblem2", "redwhitestars ", 331002651, 9833517.0);
        Country england = new Country("Great Britain", "English", "Christianity", "emblem1", "redbluestar ", 67886011, 243610.0);

        List<Country> counties = new ArrayList<>();

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
        UniqueCountriesViaOneList(counties);
    }

    public static void UniqueCountriesViaOneList(List<Country> countries) {
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
