import javax.swing.*;
import java.util.Scanner;
import  javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       System.out.println("=======================Informe seus dados=======================");

       // Aqui é onde o cliente colocar suas informações para saber se ele te cadastro no nosso sistema caso
        Cliente cliente = new Cliente();
         cliente.Informardados();



        // aqui simulamos com um cliente ja cadastrado no sistemas, por isso ja aparece os alguns dados dele no terminal
        Telefone telefone = new Telefone( 29122568 , 940487935, 65, 55, "Tim");
        Endereco endereco = new Endereco( "Rua James Gosling", 55, "", "Perto da Rod Raposo Tavares");




        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);



         Estado estado = new Estado();

         String registarEsatdo = estado.RegistrarEstado("Mato Grosso do Sul" , " ,MS");
      



        System.out.println("Telefone do cliente" + " " + cliente.getTelefone().getDdi() + " " + cliente.getTelefone().getDdd() + " " + cliente.getTelefone().getNumeroCelular());
       System.out.println("Endereço do cliente" + " " + cliente.getEndereco().getNomeRua() + " " + "Estado do Cliente:" + registarEsatdo);




        System.out.println("=======================Platação Cliente=======================");


        // como o cliente ja é cadastrado ja temos a informações da plantação dele
        Clima clima = new Clima();
        clima.setTipo("Temperatura média máxima diária de apenas 30 graus");
        Plantacao plantacao = new Plantacao("Arroz" , "Latossolos");

        System.out.println(plantacao);
        System.out.println(clima.getTipo());


        plantacao.setTipo("Arroz");
        plantacao.setSolo("Latossolos");


         System.out.println("Possui uma platação de " + plantacao.getTipo());
        System.out.println("Tipo de terra :" + " " + plantacao.getSolo() + " " + "comum em" + " " + registarEsatdo);
        System.out.println("Clima do estado :" + " " + clima.getTipo());




         System.out.println("=======================Semente=======================");

         // aqui é onde o cliente solicita a semente e a quantidade que deseja
         Semente semente = new Semente();


        semente.escolherSemente();
        semente.escolherQuantidade();






    }
}