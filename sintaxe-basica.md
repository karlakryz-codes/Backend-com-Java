


> # ☕ Estrutura Básica de um Programa Java  
>  
> Todo programa Java segue uma estrutura padrão e obrigatória. Vamos entender cada parte com calma e com exemplos! 😄  
>  
> ---  
>  
> ## 📦 1. Pacote (Opcional)  
> Usado para organizar os arquivos em pastas.  
>  
> ```java  
> package meu.pacote;  
> ```  
> 📝 *Se você não usar pacotes, o Java entende que o arquivo está no "pacote padrão".*  
>  
> ---  
>  
> ## 📚 2. Importações (Opcional)  
> Usadas quando queremos utilizar classes prontas de outras bibliotecas Java.  
>  
> ```java  
> import java.util.Scanner;  
> ```  
> 🔍 *O Java já tem várias classes prontas pra te ajudar!*  
>  
> ---  
>  
> ## 🧱 3. Classe Principal (Obrigatório)  
> Todo código precisa estar dentro de uma **classe**. O nome da classe deve ser o mesmo do nome do arquivo `.java`.  
>  
> ```java  
> public class MinhaClasse {  
>     // conteúdo aqui  
> }  
> ```  
> 🎯 *Java é totalmente baseado em classes (orientado a objetos).*  
>  
> ---  
>  
> ## 🚀 4. Método `main` (Obrigatório)  
> É por onde o programa começa a rodar. Sempre tem que estar exatamente assim:  
>  
> ```java  
> public static void main(String[] args) {  
>     // seu código aqui  
> }  
> ```  
>  
> ### 🧠 O que significa isso tudo?  
> - `public` → todo mundo pode acessar  
> - `static` → pertence à classe, não precisa criar um objeto  
> - `void` → não retorna nada  
> - `main` → nome fixo do método principal  
> - `String[] args` → permite receber argumentos ao rodar o programa  
>  
> ---  
>  
> ## 🔡 5. Impressão no Console  
>  
> ```java  
> System.out.println("Olá, Karla!");  
> ```  
>  
> - `System.out.println()` → imprime e **pula linha**  
> - `System.out.print()` → imprime **sem pular linha**  
>  
> ---  
>  
> ## 💬 6. Comentários  
>  
> ### De uma linha:  
> ```java  
> // Isso é um comentário  
> ```  
>  
> ### De várias linhas:  
> ```java  
> /*  
>    Isso é um comentário  
>    de várias linhas!  
> */  
> ```  
>  
> ---  
>  
> ## ✅ Exemplo Completo  
>  
> ```java  
> public class HelloWorld {  
>     public static void main(String[] args) {  
>         System.out.println("Olá, mundo!");  
>     }  
> }  
> ```  
>  
> ---  
>  
> ## 📁 Dicas Importantes  
> - O **nome do arquivo** deve ser **igual ao nome da classe pública** (ex: `HelloWorld.java`)  
> - Arquivos `.java` são salvos na pasta `src/` geralmente  
> - Use **letra maiúscula** na primeira letra do nome da classe (padrão Java)  
>  
> ---  
>  
> ## 🔧 Curiosidades  
>  
> | Item     | Obrigatório? | Observação                                  |  
> |----------|---------------|----------------------------------------------|  
> | `package` | ❌            | Só se quiser organizar seus arquivos         |  
> | `import`  | ❌            | Só se for usar bibliotecas externas          |  
> | `class`   | ✅            | Sempre! Tudo no Java precisa estar em classe |  
> | `main()`  | ✅            | Sem ele o programa não roda                  |  
>  
> 🚨 **Erro comum**: esquecer de colocar o método `main` ou escrever diferente dele!  
>  
> ---  
>  
> ## ✍️ Desafio pra Treinar  
>  
> Crie um programa chamado `MeuNome.java` que imprima seu nome no terminal:  
>  
> ```java  
> public class MeuNome {  
>     public static void main(String[] args) {  
>         System.out.println("Meu nome é Karla!");  
>     }  
> }  
> ```
"""


