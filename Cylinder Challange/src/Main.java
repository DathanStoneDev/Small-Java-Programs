public class Main {

    public static void main(String[] args){

        Circle circle = new Circle(3.75);
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

        Cylinder cylinder = new Cylinder(3.75, 6.2);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getVolume());
    }

}
