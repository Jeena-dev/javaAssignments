package homework;

public class Husband {

private     String name;
private     int age;
 private    String job;
 private String education;
 private String home;




    public Husband(){

    }

    public Husband(String name, int age, String job, String education, String home) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.education = education;
        this.home = home;
    }

    //instance method
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

    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return job;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", education='" + education + '\'' +
                ", home='" + home + '\'' +
                '}';
    }
}
