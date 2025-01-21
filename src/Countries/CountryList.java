package Countries;

import java.util.LinkedList;

public class CountryList {
    public static void main(String[] args) {
        Country armenia = new Country("Armenia", "Armenian", "Armenian Apostolic Church", "zinanshan", "redblueyellow", 2968000, 29743);
        Country russia = new Country("Russia", "Russian", "Russian Orthodox Church", "zinanshan", "redbluewhite ", 146599183, 17098242.0);
        Country america = new Country("United States", "English", "Christianity", "zinanshan", "redbluewhite ", 331002651, 9833517.0);
        Country england = new Country("Great Britain", "English", "Christianity", "zinanshan", "redbluewhite ", 67886011, 243610.0);

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
//        System.out.println(counties);
        UniqueCountriesOneList(counties);
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
            for (int j = 0; j < countries.size(); j++) {
                if (j == i) {
                    countries.remove(i);
                }
            }
        }
        System.out.println(countries);
    }
}
