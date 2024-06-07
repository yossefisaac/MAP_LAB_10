package entidades;

public class Queijo {
    private String tipo;
    
    public Queijo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Queijo " + tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Queijo other = (Queijo) obj;
        return tipo.equals(other.tipo);
    }
}
