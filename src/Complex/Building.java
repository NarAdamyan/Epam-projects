package Complex;

public class Building extends Neighborhood {
    int countOfparking;
    int countOfFloor;
    int number;

    public Building(Address adress, int countOfFloor, int countOfparking, int number) {
        super(adress);
        this.countOfFloor = countOfFloor;
        this.countOfparking = countOfparking;
        this.number = number;
    }
}
