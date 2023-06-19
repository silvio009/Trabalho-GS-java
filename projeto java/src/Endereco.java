public class Endereco {
    private String nomeRua;
    private int numeroRua;

    private  String complemento;

    private String pontoReferencia;

    private Estado estado;



    public Endereco() {
    }

    public Endereco(String nomeRua, int numeroRua, String complemento, String pontoReferencia) {
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.complemento = complemento;
        this.pontoReferencia = pontoReferencia;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(int numeroRua) {
        this.numeroRua = numeroRua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return this.estado;
    }


}
