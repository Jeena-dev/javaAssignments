package homework;

/**
 * @Author : Jeena Noori
 */

public class Person {

 private   String name;
 private    String gender;
 private    int age;
 private    double weight;
 private    double height;
 private    String eyeColor;
 private    String hairColor;



    public Person(){

    }

    /**
     *
     * @param name
     * @param gender
     * @param age
     * @param weight
     * @param height
     * @param eyeColor
     * @param hairColor
     */

    public Person(String name,
                  String gender,
                  int age,
                  double weight,
                  double height,
                  String eyeColor,
                  String hairColor)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }


    public void setName(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
         return age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }


    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public String getHairColor(){
        return hairColor;
    }

    @Override
    public String toString() {
        return "homework.Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
