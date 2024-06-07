package factorys;

import entidades.OvoGranja;
import entidades.PaoBola;
import entidades.PresuntoPeru;
import entidades.QueijoPrato;
import entidades.Sanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import interfaces.SanduicheFactory;

// Implementação da interface SanduicheFactory para criar sanduíches de pão bola
public class SanduicheBolaFactory implements SanduicheFactory {
    // Método para criar uma nova instância da fábrica
    @Override
    public SanduicheFactory criarFactory() {
        return new SanduicheBolaFactory();
    }
    
    // Método para criar um sanduíche de pão bola
    @Override
    public Sanduiche criarSanduiche() {
        // Cria os ingredientes do sanduíche
        Pao paoBola = new PaoBola();
        Queijo queijoPrato = new QueijoPrato();
        Presunto presuntoPeru = new PresuntoPeru();
        Ovo ovoGranja = new OvoGranja();
        // Cria e prepara o sanduíche com os ingredientes
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.preparar(paoBola, queijoPrato, presuntoPeru, ovoGranja);
        return sanduiche;
    }
}
