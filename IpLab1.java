public class IpLab1{
    public static void main(String[] args){
        Car Duster = new Dacia();
        Duster.maxSpeed();
        Duster.fuel();
        System.out.println();
        Train train = new Tgv();
        train.capacity();
        train.speed();
        System.out.println();
        MilitaryAirplane plane = new MilitaryAirplane();
        plane.typeAirplane();
        System.out.println(plane.type);
        System.out.println(plane.color);
        System.out.println(plane.altitude);
        System.out.println();
        Plus n = new Plus();
        n.add();
        n.add(12);
        n.add(13, 2);
        System.out.println();
        Shape shape = new Shape();
        Circle circle = new Circle();
        shape.text();
        circle.text();
    }
}
//abstract class
abstract class Car{
    abstract void maxSpeed();
    abstract void fuel();
}

class Dacia extends Car{
    int year=2010;
    Dacia(){
        System.out.println("Dacia");
    }
    void maxSpeed() {
        System.out.println("200 km/h");
    }
    void fuel() {
        System.out.println("gasoline");
    }
}

//interface
interface Train{
    void speed();
    void capacity();
}

class Tgv implements Train{
    String route = "Paris - Nice";
    public void speed(){
        System.out.println("270 km/h");
    }
    public void capacity(){
        System.out.println("100 people");
    }
}

//inheritance
class Airplane{
    public void typeAirplane(){
        System.out.println("Type of airplane: ");
    }

}

class MilitaryAirplane extends Airplane{
    public String type="military";
    public String color="green";
    public int altitude=10000;
}

//polymorphism static
class Plus{
    public void add(){
        System.out.println("0");
    }
    public void add(int a){
        System.out.println("Number is " + a);
    }
    public void add(int a, int b){
        int sum=a+b;
        System.out.println(a + "+" + b + "=" + sum);
    }
}

//polymorphism dynamic
class Shape{
    double area;
    public void text(){
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    double pi=3.14;
    double radius=3;
    public void text(){
        System.out.println("This is a circle");
    }
}