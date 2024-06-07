package factorys;

import entidades.OvoCapoeira;
import entidades.PaoIntegral;
import entidades.PresuntoPeru;
import entidades.QueijoMussarela;
import entidades.Sanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import interfaces.SanduicheFactory;

// Implementação da interface SanduicheFactory para criar sanduíches de pão integral
public class SanduicheIntegralFactory implements SanduicheFactory {
    // Método para criar uma nova instância da fábrica
    @Override
    public SanduicheFactory criarFactory() {
        return new SanduicheIntegralFactory();
    }

    // Método para criar um sanduíche de pão integral
    @Override
    public Sanduiche criarSanduiche() {
        // Cria os ingredientes do sanduíche
        Pao paoIntegral = new PaoIntegral();
        Queijo queijoMussarela = new QueijoMussarela();
        Presunto presuntoPeru = new PresuntoPeru();
        Ovo ovoCapoeira = new OvoCapoeira();
        // Cria e prepara o sanduíche com os ingredientes
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.preparar(paoIntegral, queijoMussarela, presuntoPeru, ovoCapoeira);
        return sanduiche;
    }    
}
