abstract class Vegetable{
    String color;
    abstract public String toString();
}
class Potato extends Vegetable{
    Potato(){
        color="Yellow";
    }
    public String toString(){
        return color;
    }
}
class Brinjal extends Vegetable{
    Brinjal(){
        color="Purple";
    }
    public String toString(){
        return color;
    }
}
class Tomato extends Vegetable{
    Tomato(){
        color="Red";
    }
    public String toString(){
        return color;
    }
}
public class VegetableDemo {
    public static void main(String[] args) {
        Potato p1=new Potato();
        System.out.println("Potato ="+p1.toString());

        Tomato t1=new Tomato();
        System.out.println("Tomato="+t1.toString());

        Brinjal b1=new Brinjal();
        System.out.println("Brinjal="+b1.toString());
    }
}