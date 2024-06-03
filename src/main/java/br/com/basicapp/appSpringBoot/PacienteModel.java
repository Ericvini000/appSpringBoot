package br.com.basicapp.appSpringBoot;

public class PacienteModel {
    private long id;
    private String name;
    private int idade;
    private String endereco;

    public PacienteModel(long id, String name, int idade, String endereco) {
        this.id = id;
        this.idade = idade;
        this.name = name;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long newId) {
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }
}
