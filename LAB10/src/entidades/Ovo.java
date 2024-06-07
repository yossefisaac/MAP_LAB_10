package entidades;

public class Ovo {
    private String tipo;
    
    public Ovo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Ovo " + tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Ovo other = (Ovo) obj;
        return tipo.equals(other.tipo);
    }
}
