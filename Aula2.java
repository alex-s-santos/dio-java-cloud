//Criando e chamando métodos

public class Aula2 {

    public static void main (String [] args) {
        String nome = "Alex";
        String sobrenome = "Santos";

        String saudacao = nomeCompleto(nome, sobrenome); //Chamando método

        System.out.println(saudacao);
    }

    //Criando um método
    public static String nomeCompleto (String primenroNome, String segundoNome) {


        return "Olá, mundo! Eu sou o: " + primenroNome + " " + segundoNome + "!";
    }


}