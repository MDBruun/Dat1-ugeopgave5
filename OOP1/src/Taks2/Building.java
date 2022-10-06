package Taks2;

public class Building {
    final Room [] rooms;
    private int numbersOfBathrooms;
    private int numbersOfFloors;
    private boolean isOfficeBuilding;

    public Building(Room [] rooms,int numbersOfBathrooms,int numbersOfFloors, boolean isOfficeBuilding){
        this.rooms=rooms;
        this.numbersOfBathrooms=numbersOfBathrooms;
        this.numbersOfFloors=numbersOfFloors;
        this.isOfficeBuilding=isOfficeBuilding;
    }

    public Room [] getRooms(){
        return rooms;
    }

    public int getNumbersOfBathrooms(){
        return numbersOfBathrooms;
    }

    public int getNumbersOfFloors(){
        return numbersOfFloors;
    }

    public boolean getIsOfficeBuilding(){
        return isOfficeBuilding;
    }
}
