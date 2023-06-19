import  javax.swing.JOptionPane;
import java.util.Scanner;

public class Semente {
    private String tipo;

    private double quantidade;

    private String solo;

    private int validade;

    public Semente() {
    }

    public Semente(String tipo, double quantidade, String clima, String solo, int validade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.solo = solo;
        this.validade = validade;



    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public String getSolo() {
        return solo;
    }

    public void setSolo(String solo) {
        this.solo = solo;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }



    // Metodo para o cliente escolher o tipo da sua escolha de sementes
    public void escolherSemente(){
        Scanner semente = new Scanner(System.in);

        System.out.println("Escolha a semente");
        System.out.println("1- Trigo");
        System.out.println("2- Arroz");
        System.out.println("3- Soja");
        System.out.println("4- Milho");
        System.out.println("Digite o número da opção desejada: ");

        int opcao = semente.nextInt();
        String sementes = "";

        switch (opcao){
            case 1:
                sementes = "Trigo";
                System.out.println("Semente escolhida: Trigo " +
                        " clima para Trigo:  Prefere temperaturas entre 15°C e 24°C durante o dia e entre 7°C e 12°C durante a noite" + " Tipo de solo : Latossolos, Argissolos e Nitossolos");
                break;
            case 2:
                sementes = "Arroz";
                System.out.println("Semente escolhida: Arroz " +
                        " clima para Arroz:  Prefere temperaturas elevadas, geralmente entre 20°C e 35°C durante o período de crescimento" + " Tipo de solo : Latossolos, Argissolos e Nitossolos");
                break;
            case 3:
                sementes = "Soja";
                System.out.println("Semente escolhida: Soja " +
                        " clima para Soja:  Prefere temperaturas entre 20°C e 30°C durante o dia e entre 15°C e 20°C durante a noite" + " Tipo de solo : Latossolos, Argissolos e Nitossolos");
                break;
            case 4:
                sementes = "Milho";
                System.out.println("Semente escolhida: Milho " +
                        " clima para Milho:  Prefere temperaturas entre 20°C e 32°C durante o dia e entre 16°C e 21°C durante a noite." + " Tipo de solo : Latossolos, Argissolos e Nitossolos");
                break;
            default:
                System.out.println("Opção inválida.");
                semente.close();
                return;





        }

    }


    // Metodo para o cliente escolher o tipo da sua escolha da quantidade que deseja
    public void escolherQuantidade(){
        Scanner quantidade = new Scanner(System.in);

        System.out.println("Escolha a qualtidade");
        System.out.println("1- 1kg");
        System.out.println("2- 5kg");
        System.out.println("3- 10kg");
        System.out.println("4- 15kg");
        System.out.println("Digite o número da opção desejada: ");


        int opcao = quantidade.nextInt();
        String punhado = "";
        switch (opcao){
            case 1:
                punhado = "1kg";
                System.out.println("Quantidade escolhida escolhida: 1kg " );
                break;
            case 2:
                punhado = "5kg";
                System.out.println("Quantidade escolhida escolhida: 5kg " );
                break;
            case 3:
                punhado = "10kg";
                System.out.println("Quantidade escolhida escolhida: 10kg " );
                break;
            case 4:
                punhado = "15kg";
                System.out.println("Quantidade escolhida escolhida: 15kg " );
                break;
            default:
                System.out.println("Opção inválida.");
                quantidade.close();
                return;

    }

    }

    }

















