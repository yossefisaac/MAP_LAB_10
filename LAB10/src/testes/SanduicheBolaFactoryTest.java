package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.Sanduiche;
import factorys.SanduicheBolaFactory;
import interfaces.SanduicheFactory;

public class SanduicheBolaFactoryTest {
    // Teste para verificar se o sanduíche criado pela fábrica de pão bola tem os ingredientes corretos
    @Test
    public void testeSanduicheBolaFactory() {
        // Cria uma fábrica de sanduíches de pão bola
        SanduicheFactory factory = new SanduicheBolaFactory();
        // Cria um sanduíche usando a fábrica
        Sanduiche sanduiche = factory.criarSanduiche();
        // Verifica se os ingredientes do sanduíche são os esperados
        assertEquals("Pão Bola, Queijo Prato, Presunto de Peru, Ovo de Granja, Tomate", sanduiche.toString());
    }
}