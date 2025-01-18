package homework;

public class Teacher {
    //instance variable which has default value.
   private int id;
  private   String firstName;
  private   String lastName;
  private   char sex;


    //default constructor
    public Teacher(){

    }

    public Teacher(int id, String firstName, String lastName, char sex) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    //instance method   : setter
    public void setId(int id){
        this.id = id;
    }
// getter
 public int getId(){
        return id;
 }

 public void setFirstName(String firstName){
        this.firstName = firstName;
 }

 public String getFirstName(){
        return firstName;
 }

 public void setLastName(String lastName){
        this.lastName = lastName;
 }

 public String getLastName(){
        return lastName;
 }

 public void setSex(char sex){
        this.sex = sex;
 }

 public char getSex(){
        return sex;
 }

    @Override
    public String toString() {
        return "homework.Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }
}
