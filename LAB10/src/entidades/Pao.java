package entidades;

public class Pao {
    private String tipo;
    
    public Pao(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Pão " + tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pao other = (Pao) obj;
        return tipo.equals(other.tipo);
    }
}
