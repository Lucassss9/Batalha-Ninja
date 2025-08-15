import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Sakura", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Sasori", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        Assert.assertEquals(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Sasuke", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        Assert.assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Itachi", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(4, 10);
        Ninja ninjaOponente = new Ninja("Jiraya", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaAtacante, vencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Neji", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(2, 6);
        Ninja ninjaOponente = new Ninja("Itachi", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaOponente, vencedor);

    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Kakashi", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 10);
        Ninja ninjaOponente = new Ninja("Madara", jutsuNinjaOponente);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(ninjaAtacante, ninjaOponente);

        Assert.assertEquals(ninjaAtacante, vencedor);
    }
}
