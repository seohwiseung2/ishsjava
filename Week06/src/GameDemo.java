public class GameDemo {
    public static void main(String[] args) {
        Pikachu myPikachu = new Pikachu(100, 27);
        Pikachu yourPikachu = new Pikachu(100, 28);
        Squirtle enemySquirtle = new Squirtle(120, 21);
        System.out.println("Game start~");
        myPikachu.attack(enemySquirtle);
        enemySquirtle.attack(myPikachu);
        myPikachu.attack(enemySquirtle);
        enemySquirtle.attack(myPikachu);
        for(int i=0;i<5;i++)
            enemySquirtle.attack(myPikachu);

        System.out.println(enemySquirtle);
        System.out.println(myPikachu);
    }
}