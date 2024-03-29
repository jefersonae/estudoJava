public abstract class Pessoa {
    private String nome ;
    private char sex;
    private String nomeNascimento;
    private String dataNascimento;
    private String cpf;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getNomeNascimento() {
        return nomeNascimento;
    }
    public void setNomeNascimento(String nomeNascimento) {
        this.nomeNascimento = nomeNascimento;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    abstract double calcularRemuneracao();
    public String toString(){
        return "Nome: "+getNome()+"\n"+
                "Sexo: "+getSex()+"\n"+
                "Local Nascimento: "+getNomeNascimento()+"\n"+
                "Data Nascimento: "+getDataNascimento()+"\n"+
                "CPF: "+getCpf()+"\n";
    }
}