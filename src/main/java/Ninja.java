public class Ninja {

    private String nomeDoNinja;
    private int chakra = 100;
    private Jutsu jutsuPrincipal;

    public Ninja(String nomeDoNinja, Jutsu jutsuPrincipal) {
        this.nomeDoNinja = nomeDoNinja;
        this.jutsuPrincipal = jutsuPrincipal;


    }

    public void atacar(Ninja ninjaOponente) {
        int danoNoChakra = this.jutsuPrincipal.getChakra();
        int dano = this.jutsuPrincipal.getDano();

        this.chakra -= danoNoChakra;
        ninjaOponente.receberGolpe(dano);
    }

    public void receberGolpe(int golpeRecebido) {
        this.chakra -= golpeRecebido;
    }

    public int getChakra() {
        return this.chakra;
    }

    public String getNomeDoNinja() {
        return this.nomeDoNinja;
    }

}

