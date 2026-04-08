package mdp2026.pokedex;

import mdp2026.pokedex.utility.ResourceReader;

public class App {
    public static void main(String[] args) {


        //Pokemon pk = new Pokemon(1,"Saso","Erba","Fuoco",180,74);
        //Pokemon pkk = new Pokemon(155,"Saso","Erba","Fuoco",180,74);

        Pokedex pd = new Pokedex();
        pd.caricaDaJson("data.json");
        System.out.println(pd.getNomiListaPokemon());
        
    }
}
