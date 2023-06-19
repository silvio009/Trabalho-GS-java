public class Plantacao {
    private String tipo;
    private String solo;

    public Plantacao() {
    }

    public Plantacao(String tipo, String solo) {
        this.tipo = tipo;
        this.solo = solo;
        toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSolo() {
        return solo;
    }

    public void setSolo(String solo) {
        this.solo = solo;
    }



    // Metodo com sobrescrita  da platação do cliente usando o ToString
    @Override
    public String toString() {
        return "Plantacao{" +
                "tipo='" + tipo + '\'' +
                ", solo='" + solo + '\'' +
                '}';
    }
}
