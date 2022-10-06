package Taks2;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(3, 4, 2);
        Room r2 = new Room(4, 2, 5);
        Room r3 = new Room(1, 2, 3);

        Room[] rooms = new Room[3];
        rooms[0] = r1;
        rooms[1] = r2;
        rooms[2] = r3;

        Building b = new Building(rooms, 5, 4, false);
        System.out.println(countLampsInBuilding(b));
        System.out.println(isNormal(b));
    }

    public static int countLampsInBuilding(Building b) {
        int sum = 0;
        for (int i = 0; i < b.getRooms().length; i++) {
            sum += b.getRooms()[i].getNumberOfLamps();
        }
        return sum;
    }

    public static boolean isNormal(Building b){
        if(b.getNumbersOfFloors()>b.getRooms().length){
            return true;
        }else{
            System.out.println("This is an odd building");
            return false;
        }
    }
}