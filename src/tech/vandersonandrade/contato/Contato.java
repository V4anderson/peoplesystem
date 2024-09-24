package tech.vandersonandrade.contato;

import java.util.Scanner;

public class Contato {
    private String telCelular;
    private String telFixo;
    private String telComercial;
    private String email;
    Scanner leitor = new Scanner(System.in);


    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular() {
        System.out.println("Digite celular: ");
        this.telCelular = leitor.nextLine();
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telCelular = leitor.nextLine();
        System.out.println("Digite telefone Fixo: ");
        this.telFixo = telFixo;
    }

    public String getTelComercial() {
        return telComercial;
    }

    public void setTelComercial(String telComercial) {
        System.out.println("Digite telefone Comercial: ");
        this.telComercial = leitor.nextLine();
        this.telComercial = telComercial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Digite E-mail: ");
        this.email = leitor.nextLine();
        this.email = email;
    }


    public void Contato() {
        System.out.println("Digite celular: ");
        this.telCelular = leitor.nextLine();
        System.out.println("Digite telefone Fixo: ");
        this.telFixo = leitor.nextLine();
        System.out.println("Digite telefone Comercial: ");
        this.telComercial = leitor.nextLine();
        System.out.println("Digite E-mail: ");
        this.email = leitor.nextLine();
    }

    public Contato() {
    }
}