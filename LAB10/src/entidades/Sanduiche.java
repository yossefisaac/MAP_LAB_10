package entidades;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;

public class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Ovo ovo;
    private Tomate tomate = new Tomate();

    public void preparar(Pao pao, Queijo queijo, Presunto presunto, Ovo ovo) {
    	this.pao = pao;
    	this.queijo = queijo;
    	this.presunto = presunto;
    	this.ovo = ovo;
    }
    
    public Pao getPao() {
        return pao;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public Presunto getPresunto() {
        return presunto;
    }

    public Ovo getOvo() {
        return ovo;
    }

    public Tomate getTomate() {
        return tomate;
    }
    
    @Override
    public String toString() {
        return pao + ", " + queijo + ", " + presunto + ", " + ovo + ", " + tomate;
    }
}
