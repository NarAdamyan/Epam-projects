package Complex;
import java.util.Objects;

public class Apartament extends Building {
    int area;
    int rooms;
    int floor;
    boolean isOpenVeranda;

    public Apartament(Address adress,int countOfFloor, int countOfparking, int number,int area,int rooms,int floor,boolean isOpenVeranda){
        super(adress,countOfFloor,countOfparking,number);
        this.area=area;
        this.rooms=rooms;
        if (countOfFloor<floor){
            System.out.println("Not valid floor");
            return;
        }
        this.floor=floor;
        this.isOpenVeranda=isOpenVeranda;
    }
    public String getAddress() {
        return adress + " " + number + " " + floor;
    }

    // ✅ Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(adress, number, floor);
    }

    // ✅ Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Null or different class

        Apartament that = (Apartament) obj;
        return number == that.number &&
                floor == that.floor &&
                Objects.equals(adress, that.adress);
    }

    @Override
    public String toString() {
        return "Apartament{address='" + adress + "', number=" + number + ", floor=" + floor +
                ", area=" + area + ", rooms=" + rooms + ", isOpenVeranda=" + isOpenVeranda + "}";
    }
}
