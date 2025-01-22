package Countries;

public class Country {
    String name;
    String language;
    String religion;
    String emblemUrl;
    String flagUrl;
    long population;
    double area;

    public Country(String name,String language,String religion,String emblemUrl,String flagUrl,long population,double area){
        this.name=name;
        this.language=language;
        this.religion=religion;
        this.emblemUrl=emblemUrl;
        this.flagUrl=flagUrl;
        this.population=population;
        this.area=area;
    }
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
//                ", language='" + language + '\'' +
//                ", religion='" + religion + '\'' +
//                ", population=" + population +
//                ", area=" + area + " km²" +
//                ", emblem='" + emblemUrl + '\'' +
//                ", flag='" + flagUrl + '\'' +
                '}'+"\n";
    }
}
