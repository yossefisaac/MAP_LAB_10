package interfaces;

import entidades.Sanduiche;

// Interface que define o contrato para fábricas de sanduíches
public interface SanduicheFactory {
    // Método para criar uma nova instância da fábrica
    SanduicheFactory criarFactory();
    
    // Método para criar um sanduíche usando a fábrica
    Sanduiche criarSanduiche();
}
