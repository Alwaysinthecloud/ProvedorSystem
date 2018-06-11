/* Criação da classe abstrata mãe, para que assim as demais classes que serão 
Utilizadas herdar desta. */

package provedorsystem;


public abstract class Pessoa {
    private String nome,endereco,email,cpf,rg,numTelefone;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnumTelefone() {
        return numTelefone;
    }

    public void setnumTelefone(String numtelefone) {
        this.numTelefone = numtelefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
