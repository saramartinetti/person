public class Cat {

    private String nome;
    private String razza;

    public Cat(String nome, String string) {
        this.nome = nome;
        this.razza = razza;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public String getRazza() {
        return razza;
    }

    @Override
    public String toString() {
        return "Cat [nome=" + nome + ", razza=" + razza + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (razza != other.razza)
            return false;
        return true;
    }
    
}
