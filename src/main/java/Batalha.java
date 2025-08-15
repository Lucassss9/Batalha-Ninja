public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {

        if (primeiroNinja.getNomeDoNinja().equals("Itachi")) {
            return primeiroNinja;
        }
        if (segundoNinja.getNomeDoNinja().equals("Itachi")) {
            return segundoNinja;
        }

        for (int i = 0; i < 3; i++) {
            primeiroNinja.atacar(segundoNinja);
            segundoNinja.atacar(primeiroNinja);
        }

        if (primeiroNinja.getChakra() >= segundoNinja.getChakra()) {
            return primeiroNinja;
        } else {
            return segundoNinja;
        }
    }
}

