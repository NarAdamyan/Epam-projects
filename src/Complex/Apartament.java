package Complex;

import java.util.HashMap;

public class Apartament extends Building {
    int area;
    int rooms;
    int floor;
    boolean isopenVeranda;

    public Apartament(Address adress,int countOfFloor, int countOfparking, int number,int area,int rooms,int floor,boolean isOpenVeranda){
        super(adress,countOfFloor,countOfparking,number);
        this.area=area;
        this.rooms=rooms;
        if (countOfFloor<floor){
            System.out.println("Not valid floor");
            return;
        }
        this.floor=floor;
        this.isopenVeranda=isOpenVeranda;
    }
    public String getAddress() {
        return adress + " " + number + " " + floor;
    }

    @Override
    public String toString() {
        return "Appartament{floor='" + floor + "', area=" + area + ", rooms=" + rooms + "}";
    }

}
