package factorys;

import entidades.OvoCapoeira;
import entidades.PaoFrances;
import entidades.PresuntoFrango;
import entidades.QueijoCheddar;
import entidades.Sanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import interfaces.SanduicheFactory;

// Implementação da interface SanduicheFactory para criar sanduíches de pão francês
public class SanduicheFrancesFactory implements SanduicheFactory {
    // Método para criar uma nova instância da fábrica
    @Override
    public SanduicheFactory criarFactory() {
        return new SanduicheFrancesFactory();
    }
    
    // Método para criar um sanduíche de pão francês
    @Override
    public Sanduiche criarSanduiche() {
        // Cria os ingredientes do sanduíche
        Pao paoFrances = new PaoFrances();
        Queijo queijoCheddar = new QueijoCheddar();
        Presunto presuntoFrango = new PresuntoFrango();
        Ovo ovoCapoeira = new OvoCapoeira();
        // Cria e prepara o sanduíche com os ingredientes
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.preparar(paoFrances, queijoCheddar, presuntoFrango, ovoCapoeira);
        return sanduiche;
    }
}
