public class GameDemo {
    public static void main(String[] args) {

        Jetpack jetpack = new Jetpack();


        Pikachu p1 = new Pikachu(100, 27);
        p1. setFlyingTool(new NoFly());
        p1. performFlyable();
        p1.setFlyingTool(jetpack); // 잿팩 얻음
        p1.performFlyable();
       // Pikachu p2 = new Pikachu(100, 28);
        Charizard s1 = new Charizard(300, 60);
        s1.setFlyingTool(new Wings());
        s1. performFlyable();
       // Squirtle s1 = new Squirtle(120, 21);

        System.out.println("시작");
        System.out.println(p1);
        System.out.println(s1);
        System.out.println("따라라라라ㅏㅏ라라라란");

        int turn = 2;

        while (!p1.isFainted() && !s1.isFainted()) {
            System.out.println("턴 " + turn + "시작.");
            p1.attack(s1);
            if (s1.isFainted()) {
                System.out.println(s1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
                break;
            }
            s1.attack(p1);
            if (p1.isFainted()) {
                System.out.println(p1.getName() + "이(가) 기절했습니다! " + s1.getName() + " 승리!");
                break;
            }
            System.out.println("==============");
            turn++;
        }
        System.out.println("배틀 종료");
    }
}
//        Pikachu myPikachu = new Pikachu(100, 27);
//        Pikachu yourPikachu = new Pikachu(100, 28);
//        Squirtle enemySquirtle = new Squirtle(120, 21);
//        System.out.println("Game start~");
//        myPikachu.attack(enemySquirtle);
//        enemySquirtle.attack(myPikachu);
//        myPikachu.attack(enemySquirtle);
//        enemySquirtle.attack(myPikachu);
//        for(int i=0;i<5;i++)
//            enemySquirtle.attack(myPikachu);
//
//        System.out.println(enemySquirtle);
//        System.out.println(myPikachu);
//    }
//}