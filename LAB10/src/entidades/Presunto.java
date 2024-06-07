package entidades;

public class Presunto {
    private String tipo;
    
    public Presunto(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Presunto " + tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Presunto other = (Presunto) obj;
        return tipo.equals(other.tipo);
    }
}
