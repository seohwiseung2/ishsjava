package fly;

import pokemons.Pokemon;

public class NoFly implements Flyable {
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println(pokemon.getName() +"날 수 없다");
    }
}
