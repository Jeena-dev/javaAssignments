import homework.*;

public class ObjectMain {
    public static void main(String[] args) {


        Teacher smartTeacher = new Teacher();

        smartTeacher.setId(4);
        System.out.println(smartTeacher.getId());

        smartTeacher.setFirstName("Ajmal");
        System.out.println(smartTeacher.getFirstName());

        smartTeacher.setLastName("Hakim");
        System.out.println(smartTeacher.getLastName());

        smartTeacher.setSex('m');
        System.out.println(smartTeacher.getSex());

        System.out.println(smartTeacher);

//        System.out.println(smartTeacher.id);
//        System.out.println(smartTeacher.sex);


        Cup bCup = new Cup("brown",15.0,true);

        System.out.println(bCup);

        bCup.setColor("gray");
        System.out.println(bCup.getColor());


        bCup.setVolume(22.3);
        System.out.println(bCup.getVolume());

//      System.out.println(whiteCup.volume);

        bCup.setHasHandle(true);
        System.out.println(bCup.getHasHandle());


        //homework.Home
     Home myHome = new Home();

//        System.out.println(color);


    myHome.setColor("golden");
        System.out.println(myHome.getColor());

myHome.setId(1);
        System.out.println(myHome.getId());

        myHome.setVolume(129);
        System.out.println(myHome.getVolume());

        myHome.setMap("Alokozy");
        System.out.println(myHome.getMap());

        myHome.setType('3');
        System.out.println(myHome.getType());

        System.out.println(myHome);

// homework.Dog
        Dog cuteDog = new Dog();

//        System.out.println(cuteDog.age);
//        System.out.println(cuteDog.name);
//        System.out.println(cuteDog.breed);
//        System.out.println(cuteDog.price);

        cuteDog.setAge(2);
        System.out.println(cuteDog.getAge());

        cuteDog.setName("Doge");
        System.out.println(cuteDog.getName());

        cuteDog.setColor("white gold");
        System.out.println(cuteDog.getColor());

        cuteDog.setBreed("Golden Retriever");
        System.out.println(cuteDog.getBreed());

        cuteDog.setPrice(300);
        System.out.println(cuteDog.getPrice());


        System.out.println(cuteDog);

 //homework.Husband

      Husband reliableHusband = new Husband();

//        System.out.println(reliableHusband.age);
        reliableHusband.setAge(28);
        System.out.println(reliableHusband.getAge());

        reliableHusband.setName("Benam");
        System.out.println(reliableHusband.getName());

       reliableHusband.setJob("full stuck developer");
        System.out.println(reliableHusband.getJob());



        System.out.println(reliableHusband);


//Human

        Person  javan = new Person();

//        System.out.println(javan.age);

        javan.setName("Arman");
        System.out.println(javan.getName());

      javan.setAge(9);
        System.out.println(javan.getAge());

        javan.setGender("male");
        System.out.println(javan.getGender());

        javan.setWeight(65);
        System.out.println(javan.getWeight());

        javan.setHeight(6);
        System.out.println(javan.getHeight());

        javan.setEyeColor("brown");
        System.out.println(javan.getEyeColor());

        javan.setHairColor("brown");
        System.out.println(javan.getHairColor());

        System.out.println(javan);

// homework.Car

   Car fastCar = new Car();

   fastCar.setYear(2024);
        System.out.println(fastCar.getYear());

   fastCar.setModel("Camry");
        System.out.println(fastCar.getModel());

   fastCar.setMake("Ford");
        System.out.println(fastCar.getMake());

   fastCar.setColor("black");
        System.out.println(fastCar.getColor());


   fastCar.setMileage(0.5);
        System.out.println(fastCar.getMileage());

        System.out.println(fastCar);
    }
}