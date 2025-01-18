package homework;

public class Dog {

  private   int age;
private String name;
private     String color;
private     String breed;
private     int price;


    public Dog(){

    }


    public Dog(int age, String name, String color, String breed, int price){
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.price = price;
    }


    public void setAge(int age){
        this.age = age;
    }


    public int getAge(){
        return age;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;

    }


    public void setColor(String color){
        this.color = color;
    }


    public String getColor(){
        return color;
    }


    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "homework.Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}
