package homework;

public class Cup {
    //properties: instance variable

  private   String color;
  private   double volume;
   private boolean hasHandle;


public Cup(){

}

    public Cup(String color, double volume, boolean hasHandle){
        this.color = color;
        this.volume = volume;
        this.hasHandle = hasHandle;
    }


    public void setColor(String color){
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setVolume(double volume){
    this.volume = volume;
    }

    public double getVolume(){
          return this.volume;
    }

    public void setHasHandle(boolean hasHandle){
           this.hasHandle = hasHandle;
    }

    public boolean getHasHandle(){
         return hasHandle;
    }

    @Override
    public String toString() {
        return "homework.Cup{" +
                "color='" + color + '\'' +
                ", volume=" + volume +
                ", hasHandle=" + hasHandle +
                '}';
    }
}