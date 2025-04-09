public class VariaveisExemplo {
    //Ela está dizendo ao Java que você está criando uma classe com o nome VariaveisExemplo

   
    public static void main(String[] args) {

     //Essa é a porta de entrada do programa Java. É por onde o Java começa a executar o código.
    //*public *Significa que o método pode ser acessado de qualquer lugar — é público.
    //*static */Quer dizer que esse método pertence à classe e não a um objeto. Isso permite
    // que ele seja executado sem precisar criar um objeto da classe.
    //*void */Significa que esse método não retorna nenhum valor
    //*main */O Java procura por esse método pra começar a execução do programa.
    //*String[] args */Representa uma lista de argumentos que podem ser passados quando você executa 
    //o programa pelo terminal.
    

        int idade = 25;              // número inteiro
        double altura = 1.68;        // número com casas decimais
        char letra = 'A';            // caractere (sempre entre aspas simples)
        boolean ligado = true;       // verdadeiro ou falso
        String nome = "Karla";       // texto (sempre entre aspas duplas)

        // Em Java, você precisa declarar o tipo da variável antes de usá-la. Alguns exemplos:
        // Tipo  NomeBemDefinido = Atribuição

        

        // Exibindo os valores no console

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Ligado: " + ligado);

        //*System = É uma classe do Java que faz parte da biblioteca padrão. Ela representa o"sistema" do computador, 
        //e contém recursos como entrada e saída de dados.
        //*out= É um objeto estático dentro da classe System. Ele representa a saída padrão — normalmente, a tela do console.
        //*println = É um método do objeto out que imprime uma linha de texto no console.
    }
}