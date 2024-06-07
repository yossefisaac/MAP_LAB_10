package main;

import entidades.Sanduiche;
import factorys.*;
import interfaces.*;

// Classe principal que cria e imprime sanduíches usando diferentes fábricas
public class Main {
    public static void main(String[] args) {
        // Array de fábricas de sanduíches
        SanduicheFactory[] factories = { 
            new SanduicheIntegralFactory(), 
            new SanduicheFrancesFactory(), 
            new SanduicheBolaFactory() 
        };
        
        // Loop sobre as fábricas
        for (SanduicheFactory factory : factories) {
            // Cria um sanduíche usando a fábrica atual e o imprime
            Sanduiche sanduiche = factory.criarSanduiche();
            System.out.println(sanduiche);
        }
    }
}
