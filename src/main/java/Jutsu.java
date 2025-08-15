public class Jutsu {

    private int chakra;
    private int dano;

    public Jutsu(int chakra, int dano){

        if(chakra < 0) {
            chakra = 0;
        } else if (chakra > 5) {
            chakra = 5;
        }

        if(dano < 0) {
            dano = 0;
        } else if (dano > 10) {
            dano = 10;
        }

        this.chakra = chakra;
        this.dano = dano;
    }

    public int getChakra() {
        return chakra;
    }

    public int getDano() {
        return dano;
    }
}
