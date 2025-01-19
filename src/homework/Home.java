package homework;

/**
 * @Author : Jeena Noori
 */
public class Home {

private     int id;
 private  String color;
private     String map;
 private    double volume;
 private    char type;




    public Home(){

    }

    /**
     *
     * @param id
     * @param color
     * @param map
     * @param volume
     * @param type
     */

    public Home(int id, String color, String map, double volume, char type) {
        this.id = id;
        this.color = color;
        this.map = map;
        this.volume = volume;
        this.type = type;
    }

    //instance method
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setMap(String map){
        this.map = map;
    }

    public String getMap(){
        return map;
    }

    public void setVolume(double volume){
         this.volume = volume;
    }

    public double getVolume(){
          return volume;
    }

    public void setType(char type){
          this.type = type;
    }

    public char getType(){
         return type;
    }

    @Override
    public String toString() {
        return "homework.Home{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", map='" + map + '\'' +
                ", volume=" + volume +
                ", type=" + type +
                '}';
    }
}
