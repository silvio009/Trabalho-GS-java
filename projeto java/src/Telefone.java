public class Telefone {
    private int numeroTelefone;
    private int numeroCelular;
    private int ddd;
    private int ddi;
    private String operadora;

    public Telefone() {
    }

    public Telefone(int numeroTelefone, int numeroCelular, int ddd, int ddi, String operadora) {
        this.numeroTelefone = numeroTelefone;
        this.numeroCelular = numeroCelular;
        this.ddd = ddd;
        this.ddi = ddi;
        this.operadora = operadora;
        validandoTelfone();
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public void validandoTelfone(){
        System.out.println("Validando o telefone");
    }



}
