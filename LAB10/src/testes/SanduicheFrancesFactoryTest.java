package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.Sanduiche;
import factorys.SanduicheFrancesFactory;
import interfaces.SanduicheFactory;

public class SanduicheFrancesFactoryTest {
    // Teste para verificar se o sanduíche criado pela fábrica de pão francês tem os ingredientes corretos
    @Test
    public void testeSanduicheFrancesFactory() {
        // Cria uma fábrica de sanduíches de pão francês
        SanduicheFactory factory = new SanduicheFrancesFactory();
        // Cria um sanduíche usando a fábrica
        Sanduiche sanduiche = factory.criarSanduiche();
        // Verifica se os ingredientes do sanduíche são os esperados
        assertEquals("Pão Francês, Queijo Cheddar, Presunto de Frango, Ovo de Capoeira, Tomate", sanduiche.toString());
    }
}