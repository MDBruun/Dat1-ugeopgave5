package Task1;

public class Main {

    public static void main(String[] args) {
        Driver d = new Driver("Mikkel", 28);
        Car c = new Car("BMW","S12",1991,"coupe");
        c.setDriver(d);

        System.out.println(c.toString()+d.toString());

        Car c2 = new Car("Volvo","xc40",1998,"Station wagon");
        c2.setDriver(d);
        System.out.println(c2.toString()+d.toString());

    }
}