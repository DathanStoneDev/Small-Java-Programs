public class Main {

    public static void main(String[] args){
        Wall firstWall = new Wall();
        System.out.println(firstWall.getArea());

        Wall secondWall = new Wall(50, 60);
        System.out.println(secondWall.getArea());
    }
}
