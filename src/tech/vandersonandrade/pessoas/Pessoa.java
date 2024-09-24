package tech.vandersonandrade.pessoas;
import tech.vandersonandrade.composicao.Endereco;
import tech.vandersonandrade.contato.Contato;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private Contato Contato;
    Scanner leitor = new Scanner(System.in);

    public void cadastrar() {
        System.out.println("Informe o nome: ");
        this.nome = leitor.nextLine();
        System.out.println("Informe a data de nascimento: ");
        this.dataNascimento = leitor.nextLine();
        System.out.println("Deseja cadastrar o endereço ?: ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int end = leitor.nextInt();
        if(end == 1){
            Endereco endereco = new Endereco();
            endereco.cadastrar();
        }
        System.out.println("Deseja cadastrar contatos ?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int tel = leitor.nextInt();
        if(tel == 1) {
           Contato contato = new Contato();
           contato.setTelCelular();

        }

    }


}
