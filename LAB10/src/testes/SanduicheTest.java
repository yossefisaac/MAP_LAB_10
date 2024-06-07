package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.OvoCapoeira;
import entidades.OvoGranja;
import entidades.PaoFrances;
import entidades.PaoIntegral;
import entidades.PresuntoFrango;
import entidades.PresuntoPeru;
import entidades.QueijoCheddar;
import entidades.QueijoMussarela;
import entidades.Sanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class SanduicheTest {
    // Teste para verificar a preparação do sanduíche com diferentes ingredientes
    @Test
    public void testePrepararSanduiche() {
        // Cria um sanduíche
        Sanduiche sanduiche = new Sanduiche();
        // Prepara o sanduíche com ingredientes específicos
        sanduiche.preparar(new PaoFrances(), new QueijoCheddar(), new PresuntoFrango(), new OvoCapoeira());
        // Verifica se os ingredientes do sanduíche são os esperados
        assertEquals("Pão Francês, Queijo Cheddar, Presunto de Frango, Ovo de Capoeira, Tomate", sanduiche.toString());
    }
    
    // Teste para verificar se o sanduíche mantém os ingredientes corretos após a preparação, Espera-se que não mantenha.
    @Test
    public void testeManterIngredientes() {
        // Cria um sanduíche
        Sanduiche sanduiche = new Sanduiche();
        // Prepara o sanduíche com ingredientes específicos
        sanduiche.preparar(new PaoIntegral(), new QueijoMussarela(), new PresuntoPeru(), new OvoGranja());
        // Salva uma referência aos ingredientes originais
        Pao paoOriginal = sanduiche.getPao();
        Queijo queijoOriginal = sanduiche.getQueijo();
        Presunto presuntoOriginal = sanduiche.getPresunto();
        Ovo ovoOriginal = sanduiche.getOvo();
        // Modifica os ingredientes do sanduíche
        sanduiche.preparar(new PaoFrances(), new QueijoCheddar(), new PresuntoFrango(), new OvoCapoeira());
        // Verifica se os ingredientes originais foram mantidos
        assertNotEquals(paoOriginal, sanduiche.getPao());
        assertNotEquals(queijoOriginal, sanduiche.getQueijo());
        assertNotEquals(presuntoOriginal, sanduiche.getPresunto());
        assertNotEquals(ovoOriginal, sanduiche.getOvo());
    }
}
