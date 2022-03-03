package karina.fedrizzi.appminhaideia.model;

// Pojo
public class Cliente {
    private String Nome;
    private String email;
    private String telefone;
    private int idade;
    private boolean sexo;

    //public Cliente(){}

    public Cliente(String nome, String email, String telefone, int idade, boolean sexo) {
        Nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() { return Nome; }

    public void setNome(String nome) { Nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) { this.telefone = telefone; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    public boolean isSexo() { return sexo; }

    public void setSexo(boolean sexo) { this.sexo = sexo; }
}
