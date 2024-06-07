package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.Sanduiche;
import factorys.SanduicheIntegralFactory;
import interfaces.SanduicheFactory;

public class SanduicheIntegralFactoryTest {
    // Teste para verificar se o sanduíche criado pela fábrica de pão integral tem os ingredientes corretos
    @Test
    public void testeSanduicheIntegralFactory() {
        // Cria uma fábrica de sanduíches de pão integral
        SanduicheFactory factory = new SanduicheIntegralFactory();
        // Cria um sanduíche usando a fábrica
        Sanduiche sanduiche = factory.criarSanduiche();
        // Verifica se os ingredientes do sanduíche são os esperados
        assertEquals("Pão Integral, Queijo Mussarela, Presunto de Peru, Ovo de Capoeira, Tomate", sanduiche.toString());
    }
}