public class Estado {
    private String nome;
    private String sigla;

    private Endereco endereco;

    private Clima clima;



    public Estado() {
    }

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        RegistrarEstado( "a",  "b");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }


    // Metodo de sobrecarga que registra o nome + a sigla do estado do cliente
    public String RegistrarEstado(String a, String b){
        return a + b;
    }

    public void setClima(Clima clima){
        this.clima = clima;
    }

    public Clima getClima(){
        return this.clima;
    }
}
