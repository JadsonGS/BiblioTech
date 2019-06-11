package Model;

public class Usuario {
    int CPF;
    String senha;
    String nome;
    String email;
    String telefone;
    int tipo;

    public Usuario(int CPF, String senha, String nome, String email, String telefone, int tipo) {
        this.CPF = CPF;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "CPF=" + CPF + ", senha=" + senha + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", tipo=" + tipo + '}';
    }

    public Usuario() {
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
