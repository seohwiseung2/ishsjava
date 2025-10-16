public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100);
        Pikachu yourPikachu = new Pikachu(200);
        Squirtle mySquirtle = new Squirtle(300);
        Squirtle yourSquirtle = new Squirtle(100);
        System.out.println("start");
        myPikachu.attack(yourPikachu);
        mySquirtle.attack(yourPikachu);



    }
}
