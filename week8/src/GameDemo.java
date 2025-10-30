import Fly.NoFly;
import Fly.Wings;
import Pokemons.Charizard;
import Pokemons.Pikachu;
import Pokemons.Pokemon;
import Pokemons.Squirtle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
//        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
//        System.out.println(randomNumber);

        Pokemon playerPokemon = null;
        Scanner scanner = new Scanner(System.in);


            while (true){
                try{
                System.out.print("플레이어 포켓몬스터 선택\n1) 피카츄  2) 꼬부기  3) 리자몽 : ");
                int number = scanner.nextInt();  // string
                if (number-1 == 0){
                    playerPokemon = new Pikachu(100, 27, new NoFly());
                    break;
                }else if(number-1 == 1){
                    playerPokemon = new Squirtle(120, 21, new NoFly());
                    break;
                }else if (number-1 == 2){
                    playerPokemon = new Charizard(200, 40, new Wings());
                    break;
                }else
                    System.out.println("메뉴에서 골라주세요");
            }catch (InputMismatchException err){
            System.out.println("숫자로 입력하세요. 메뉴에서 고르세요.");
            //System.out.println(err.getMessage());
            scanner.nextLine(); //버퍼에 남아있는 값(여기선 문자열)제거
            }

        }


        int randomNumber = (int)(Math.random() * 3); // 0 ~ 2
        Pokemon enemyPokemon;
        System.out.println("야생의 포켓몬스터 나타났습니다");
        if(randomNumber == 0)
            enemyPokemon = new Pikachu(100, 27, new NoFly());
        else if (randomNumber == 1)
            enemyPokemon = new Squirtle(120, 21, new NoFly());
        else if (randomNumber == 2)
            enemyPokemon = new Charizard(200, 40, new Wings());



//        Fly.Jetpack jetpack = new Fly.Jetpack();
//
//
//        Pokemons.Pikachu p1 = new Pokemons.Pikachu(100, 27, new Fly.NoFly());
//        //p1.setFlyingTool(new Fly.NoFly());
//        p1.performFlyable();
//        p1.setFlyingTool(jetpack);  // 젯팩 추진기 득템
//        p1.performFlyable();
//
////        Pokemons.Pikachu p2 = new Pokemons.Pikachu(100, 28);
//        //Pokemons.Charizard c1 = new Pokemons.Charizard(200, 40, new Fly.Jetpack());
//        Pokemons.Charizard c1 = new Pokemons.Charizard(200, 40, new Fly.Wings());
//        //c1.setFlyingTool(new Fly.Wings());
//        c1.performFlyable();
////        Pokemons.Squirtle s1 = new Pokemons.Squirtle(120, 21);
//
//        System.out.println("배틀 시작!");
//        System.out.println(p1);
//        System.out.println(c1);
//        System.out.println("==============");
//
//        int turn = 1;
//        while(!p1.isFainted() && !c1.isFainted()){
//            System.out.println("턴 " + turn + "시작.");
//            p1.attack(c1);
//            if(c1.isFainted()){
//                System.out.println(c1.getName() + "이(가) 기절했습니다! " + p1.getName() + " 승리!");
//                break;
//            }
//            c1.attack(p1);
//            if(p1.isFainted()){
//                System.out.println(p1.getName() + "이(가) 기절했습니다! " + c1.getName() + " 승리!");
//                break;
//            }
//            System.out.println("==============");
//            turn++;
//        }
//        System.out.println("배틀 종료");
//    }
    }
}