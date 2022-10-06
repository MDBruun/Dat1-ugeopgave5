package Task1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver Driver;

    public Car(String make,String model, int year, String bodyStyle){
        this.make=make;
        this.model=model;
        this.year=year;
        this.bodyStyle=bodyStyle;
    }

    public Driver GetDriver(){
        return Driver;
    }

    public void setDriver(Driver Driver){
        this.Driver=Driver;
    }

    public void removeDriver(){
        Driver = null;
    }

    @Override
    public String toString(){
        return "Make: "+make+". Model: "+model+" ("+year+ "), BodyStyle: "+bodyStyle;
    }
}
