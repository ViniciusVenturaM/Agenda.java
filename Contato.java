public class Contato {
    String nome,email,telefone;

    void imprimeContato(){
        System.out.println("Nome do contato:" +nome+ "\n Email:"+email+ "Telefone:"+telefone);
    }

    String alteraEmail(String emailNovo){
        this.email = emailNovo;
        return email;
    }

    void exibeTelefone(){
        System.out.println("Numero de telefone do contato:"+telefone);
    }

}





/*Crie uma aplicação para uma agenda de contatos, que contenha a classe Contato.
        As características de um Contato são: nome, email e telefone.

        A classe Contato deve possuir os seguintes métodos:

        - imprimeContato: imprime todas as características do contato

        - alteraEmail: recebe um novo endereço de email como parâmetro e modifica o email do contato.

        - exibeTelefone: imprime apenas o número de telefone do contato.

        Crie uma classe Agenda, e dentro dessa classe crie dois objetos da classe Contato.
        Imprima as informações dos contatos criados.
        Altere o email do segundo contato criado.
*/
