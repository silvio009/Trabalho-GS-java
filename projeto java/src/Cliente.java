import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String rg;
    private LocalDate dataDeNascimento;



    private  Telefone telefone;

    private Endereco endereco;


    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, int idade, String cpf, String rg, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.rg = rg;
        this.dataDeNascimento = LocalDate.of(ano, mes, dia);
        Informardados();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dia, int mes, int ano) {
        this.dataDeNascimento = LocalDate.of(ano, mes, dia);
    }

    public void setTelefone( Telefone telefone){
        this.telefone = telefone;
    }

    public Telefone getTelefone(){
        return this.telefone;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }



    // Metodo para o cliente colocar suas Informações
    public void Informardados(){
        Scanner cliente = new Scanner(System.in);

            // Nome Cliente
       String nomeCliente;
        System.out.println("Digite seu nome:");
        nomeCliente = cliente.nextLine();
        String sobrenomeCliente;
        System.out.println("Digite seu sobrenome:");
        sobrenomeCliente = cliente.nextLine();


        // Dados do Cliente

        String cpfCliente;
        System.out.println("Digite seu cpf nesse modelo(###-###-###-##)");
        cpfCliente = cliente.nextLine();
        String rgCliente;
        System.out.println("Digite seu rg nesse modelo(###.###.###-##)");
        rgCliente = cliente.nextLine();


        System.out.println("=======================Dados do Cliente=======================");


        System.out.println("Nome do Cliente : " + " " + nomeCliente + " " + sobrenomeCliente);
       // System.out.println("Idade do Cliente: " + " " + idadeCliente + "anos");
        System.out.println("Dados do Clinte:" + " " + "Cpf:" + " " + cpfCliente + " " + "Rg:" + " " + rgCliente);
        //System.out.println("Cpf:" + " " + cpfCliente);
        //System.out.println("Rg:" + " " + rgCliente);*/

        //cliente.close();


    }

    //public void DigitarSoborenome(){
       // Scanner cliente = new Scanner(System.in);
      //  String sobrenomeCliente;
      //  System.out.println("Digite seu sobrenome:");
      //  sobrenomeCliente = cliente.nextLine();
      //  System.out.println("Sobrenome do Cliente:" + " " + sobrenomeCliente);
//
     //   cliente.close();
   // }

   // public void DigitarIdade(){
   //     Scanner cliente = new Scanner(System.in);
   //     int idadeCliente;
   //     System.out.println("Digite seu nome:");
   //     idadeCliente = cliente.nextInt();
   //     System.out.println("Nome do Cliente:" + " " + idadeCliente );

   //     cliente.close();
   // }



}
