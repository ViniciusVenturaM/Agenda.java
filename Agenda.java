public class Agenda {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        c1.nome = "Joao Victor";
        c1.email = "joaovicto@gmail.com\n";
        c1.telefone = "32999999999\n";

        c2.nome = "Vinicius Ventura";
        c2.email = "viniciusteste@gmail.com\n";
        c2.telefone = "32222222222\n";

        c1.imprimeContato();
        c2.imprimeContato();

        String aux = c2.alteraEmail("jvteste@hotmail.com");
        System.out.println(aux);

        //Como foi pedido para criar o método, resolvi realizar a chamada dele, mesmo não sendo pedido
        c1.exibeTelefone();
        c2.exibeTelefone();
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