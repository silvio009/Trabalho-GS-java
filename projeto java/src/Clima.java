public class Clima {
    private String tipo;

    private Estado estado;

    private Plantacao plantacao;


    public Clima() {
    }

    public Clima(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return this.estado;
    }

    public void setPlantacao(Plantacao plantacao){
        this.plantacao = plantacao;
    }

    public Plantacao getPlantacao(){
        return this.plantacao;
    }



}
