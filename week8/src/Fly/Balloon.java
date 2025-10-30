package Fly;

import Pokemons.Pokemon;

public class Balloon implements Flyable {




    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +"풍선을 타고 드가가가가자");
    }
}
