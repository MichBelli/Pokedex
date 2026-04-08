package mdp2026.pokedex;

public class Pokemon {

    private int numero = 0;
    private String nome = null;
    private String tipo1 = null;
    private String tipo2 = null;
    private double altezza = 0;
    private double peso = 0;
    private boolean scoperto = false;

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



    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getPeso() {
        return peso;
    }




}
