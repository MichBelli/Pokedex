package mdp2026.pokedex;

public class Pokemon {

    int numero = 0;
    String nome = null;
    String tipo1 = null;
    String tipo2 = null;
    double altezza = 0;
    double peso = 0;
    boolean scoperto = false;

    public Pokemon(int numero, String nome, String tipo1, String tipo2, double altezza, double peso) {

        if(numero < 1 || numero > 155){
            throw new IllegalArgumentException("Il numero identificativo di un pokemon deve essere compreso tra 1 e 155!");
        }
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.altezza = altezza;
        this.peso = peso;
    }




}
