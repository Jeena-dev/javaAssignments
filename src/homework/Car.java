package homework;

public class Car {

private     int year;
private     String model;
private     String make;
private     String color;
private     double mileage;


    public Car(){

    }


    public Car(int year, String model, String make, String color, double mileage){
        this.year = year;
        this. model = model;
        this.make = make;
        this.color = color;
        this.mileage = mileage;
    }

    public void setYear(int year){
        this.year = year;

    }
    public int getYear(){
        return year;
    }

    public void setModel(String model){
        this.model = model;
    }


    public String getModel(){
        return model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return make;

    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public double getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "homework.Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
