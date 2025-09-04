import java.nio.channels.SelectionKey;

class Pokemon{
    //concrete class (can produce object)
    int hp;


}
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Pokemon squirtle = new Pokemon();
        pikachu.hp = 100;
        squirtle.hp = 110;
        System.out.println(pikachu.hp);
        System.out.println(squirtle.hp);

    }

}
