package mdp2026.pokedex;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import mdp2026.pokedex.utility.ResourceReader;

public class Pokedex extends ResourceReader {

    private List<Pokemon> listaPokemon;

    public Pokedex(){

        this.listaPokemon = new ArrayList<>();
    }



    public void caricaDaJson(String nomeFile) {
        // 1. Usa il metodo della classe astratta per ottenere il testo
        String jsonDati = leggiFile(nomeFile);

        // 2. Trasforma il testo in oggetti (usando Gson come visto prima)
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Pokemon>>(){}.getType();

        this.listaPokemon = gson.fromJson(jsonDati, listType);

        System.out.println("Caricati " + listaPokemon.size() + " pokemon dal file risorse.");
    }



    public String getNomiListaPokemon(){

        String nomipokemon = "";

        for(int i = 0; i < this.listaPokemon.size(); i++){

            nomipokemon = nomipokemon + "\n" + listaPokemon.get(i).getNumero() + ": " + listaPokemon.get(i).getNome();
        }


        return nomipokemon;
    }

}
