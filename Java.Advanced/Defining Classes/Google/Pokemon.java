package DefiningClasses.Google;

public class Pokemon {

    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public String toString() {
        return pokemonName + " " + pokemonType;
    }
}

