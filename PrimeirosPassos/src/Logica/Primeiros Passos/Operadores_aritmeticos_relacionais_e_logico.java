// Esta linha define o pacote onde esta classe está localizada, 
//			organizando-a em uma “pasta lógica” chamada logica.  
// package → palavra reservada que inicia a declaração de pacote  
// logica  → nome do pacote que agrupa classes relacionadas  
package logica;

/*  
 * Tópicos que você vai aprender:  
 * ✅ Operadores Aritméticos (somar, subtrair, multiplicar…)  
 * ✅ Operadores Relacionais (comparar valores: igual, maior, menor…)  
 * ✅ Operadores Lógicos (ligar condições com E, OU, NÃO…)  
 */  

// Esta linha declara a classe pública que contém todo o 
//			programa e deve ter o mesmo nome do arquivo.  
// public  → modificador de acesso que permite visibilidade em todo o projeto  
// class   → palavra reservada que inicia a definição de classe  
// Operadores_aritmeticos_relacionais_e_logico → identificador da 
//			classe, nome descritivo e único  
public class Operadores_aritmeticos_relacionais_e_logico {

    // Esta linha inicia o método principal, que é o ponto de
	//			entrada da aplicação Java.  
    // public      → torna o método acessível de qualquer lugar  
    // static      → vincula o método à classe, dispensando instanciar objetos  
    // void        → indica que o método não retorna valor  
    // main        → nome fixo do método principal em Java  
    // String[]    → tipo do parâmetro; array de Strings  
    // args        → nome do parâmetro que recebe argumentos da linha de comando  
    public static void main(String[] args) {
    
        // Esta linha chama o método que demonstra operadores aritméticos básicos.  
        // mostrarOperadoresAritmeticos() → chamada do método sem parâmetros  
        mostrarOperadoresAritmeticos();

        // Esta linha imprime uma linha de separação no console 
    	//			para melhor visualização.  
        // System → classe que representa o sistema de E/S  
        // .out   → objeto de saída padrão (console)  
        // .println(...) → método que imprime texto e quebra a 
    	//			linha automaticamente  
        System.out.println("--------------------------");

        // Esta linha chama o método que demonstra operadores 
    	//			relacionais de comparação.  
        // mostrarOperadoresRelacionais() → chamada do método sem parâmetros  
        mostrarOperadoresRelacionais();

        // Esta linha imprime outra linha de separação no console.  
        System.out.println("--------------------------");

        // Esta linha chama o método que demonstra operadores lógicos.  
        // mostrarOperadoresLogicos() → chamada do método sem parâmetros  
        mostrarOperadoresLogicos();
        
    }

    // Esta linha declara o método que mostra operadores 
	//			aritméticos básicos em Java.  
    // public  → acesso público ao método  
    // static  → método pertence à classe, não a instâncias  
    // void    → sem valor de retorno  
    // mostrarOperadoresAritmeticos → nome do método  
    public static void mostrarOperadoresAritmeticos() {

        // Esta linha declara uma variável inteira chamada “a” e 
    	//			atribui o valor 10.  
        // int → tipo primitivo para números inteiros  
        // a   → nome da variável  
        // =   → operador de atribuição  
        // 10  → literal inteiro  
        // ;   → finaliza a instrução  
        int a = 10;

        // Esta linha declara uma variável inteira chamada “b” e atribui o valor 3.  
        // int → tipo primitivo para números inteiros  
        // b   → nome da variável  
        // =   → operador de atribuição  
        // 3   → literal inteiro  
        // ;   → finaliza a instrução  
        int b = 3;

        // Esta linha imprime “Soma: ” seguido do resultado da expressão (a + b).  
        // System → classe para operações de sistema  
        // .out → saída padrão (console)  
        // .println → método de impressão com quebra de linha  
        // "Soma: " → texto fixo  
        // + → operador de concatenação  
        // (a + b) → soma de a e b  
        System.out.println("Soma: " + (a + b));

        // Esta linha imprime “Subtração: ” seguido do resultado da 
    	//			expressão (a - b).  
        // "Subtração: " → texto fixo  
        // (a - b) → subtração de b de a  
        System.out.println("Subtração: " + (a - b));

        // Esta linha imprime “Multiplicação: ” seguido do 
    	//			resultado da expressão (a * b).  
        // "Multiplicação: " → texto fixo  
        // (a * b) → multiplicação de a por b  
        System.out.println("Multiplicação: " + (a * b));

        // Esta linha imprime “Divisão: ” seguido do resultado 
    	//			inteiro da expressão (a / b).  
        // "Divisão: " → texto fixo  
        // (a / b) → divisão inteira de a por b  
        System.out.println("Divisão: " + (a / b));

        // Esta linha imprime “Resto da divisão: ” seguido do 
    	//			resultado da expressão (a % b).  
        // "Resto da divisão: " → texto fixo  
        // (a % b) → operador módulo, resto da divisão de a por b  
        System.out.println("Resto da divisão: " + (a % b));
        
    }

    // Esta linha declara o método que mostra operadores 
	//			relacionais de comparação em Java.  
    // public  → acesso público ao método  
    // static  → método pertence à classe, não a instâncias  
    // void    → sem valor de retorno  
    // mostrarOperadoresRelacionais → nome do método
    public static void mostrarOperadoresRelacionais() {

        // Esta linha declara uma variável inteira chamada “x” e 
    	//			atribui o valor 10.  
        // int → tipo inteiro  
        // x   → nome da variável  
        // =   → atribuição  
        // 10  → valor atribuído  
        int x = 10;

        // Esta linha declara uma variável inteira chamada “y” e 
    	//			atribui o valor 20.  
        // int → tipo inteiro  
        // y   → nome da variável  
        // =   → atribuição  
        // 20  → valor atribuído  
        int y = 20;

        // Esta linha imprime “x é igual a y? ” seguido do resultado da 
    	//			comparação (x == y).  
        // == → operador de igualdade  
        // System → classe que representa o sistema de E/S  
        // .out   → objeto de saída padrão (console)  
        // .println(...) → método que imprime texto e quebra a 
    	//			linha automaticamente
        System.out.println("x é igual a y? " + (x == y));

        // Esta linha imprime “x é diferente de y? ” seguido do 
    	//			resultado da comparação (x != y).  
        // != → operador de diferença  
        System.out.println("x é diferente de y? " + (x != y));

        // Esta linha imprime “x é maior que y? ” seguido do 
    	//			resultado da comparação (x > y).  
        // > → operador maior que  
        System.out.println("x é maior que y? " + (x > y));

        // Esta linha imprime “x é menor que y? ” seguido do 
    	//			resultado da comparação (x < y).  
        // < → operador menor que  
        System.out.println("x é menor que y? " + (x < y));

        // Esta linha imprime “x é maior ou igual a 10? ” 
    	//			seguido do resultado (x >= 10).  
        // >= → operador maior ou igual  
        System.out.println("x é maior ou igual a 10? " + (x >= 10));

        // Esta linha imprime “y é menor ou igual a 15? ” 
    	//			seguido do resultado (y <= 15).  
        // <= → operador menor ou igual  
        System.out.println("y é menor ou igual a 15? " + (y <= 15));
        
    }

    // Esta linha declara o método que mostra operadores lógicos em Java.
    // public                  → modificador de acesso que 
	//			permite chamar o método de qualquer classe
    // static                  → define que o método pertence à 
	//			classe, dispensando instanciar objetos
    // void                    → indica que o método não retorna valor algum
    // mostrarOperadoresLogicos→ nome do método, descreve sua funcionalidade
    // (                       → abre a lista de parâmetros (vazia neste caso)
    // )                       → fecha a lista de parâmetros
    // {                       → inicia o bloco de código do método
    public static void mostrarOperadoresLogicos() {

        // Esta linha declara uma variável inteira chamada “idade” e 
    	//			atribui o valor 18.
        // int     → tipo primitivo que armazena números inteiros
        // idade   → identificador da variável; nome descritivo
        // =       → operador de atribuição que define o valor inicial
        // 18      → literal inteiro atribuído à variável
        // ;       → finaliza a instrução
        int idade = 18;

        // Esta linha declara uma variável booleana 
    	//			chamada “temCarteira” e atribui true.
        // boolean    → tipo primitivo que armazena true ou false
        // temCarteira→ identificador da variável; indica possuí carteira
        // =          → operador de atribuição
        // true       → literal booleano verdadeiro
        // ;          → finaliza a instrução
        boolean temCarteira = true;

        // Esta linha avalia se a pessoa pode dirigir: idade >= 18 E temCarteira == true.
        // boolean        → tipo primitivo que armazena true ou false
        // podeDirigir   → identificador da variável; resultado da expressão
        // =              → operador de atribuição
        // (              → inicia expressão composta
        // idade          → variável inteira declarada anteriormente
        // >=             → operador relacional “maior ou igual”
        // 18             → literal inteiro
        // )              → fecha subexpressão
        // &&             → operador lógico “E”
        // temCarteira    → variável booleana declarada anteriormente
        // ;              → finaliza a instrução
        boolean podeDirigir = (idade >= 18) && temCarteira;

        // Esta linha avalia se a pessoa pode viajar 
    	//			sozinha: idade >= 18 OU temCarteira == true.
        // boolean           → tipo primitivo que armazena true ou false
        // podeViajarSozinho→ identificador da variável; resultado da expressão
        // =                 → operador de atribuição
        // (                 → inicia expressão composta
        // idade             → variável inteira
        // >=                → operador relacional “maior ou igual”
        // 18                → literal inteiro
        // )                 → fecha subexpressão
        // ||                → operador lógico “OU”
        // temCarteira       → variável booleana
        // ;                 → finaliza a instrução
        boolean podeViajarSozinho = (idade >= 18) || temCarteira;

        // Esta linha inverte o valor de temCarteira para verificar quem não tem.
        // boolean       → tipo primitivo que armazena true ou false
        // naoTemCarteira→ identificador da variável; resultado da negação
        // =             → operador de atribuição
        // !             → operador lógico “NÃO” que inverte o valor booleano
        // temCarteira   → variável booleana
        // ;             → finaliza a instrução
        boolean naoTemCarteira = !temCarteira;

        // Esta linha imprime “Pode dirigir? ” seguido do
        //			valor de podeDirigir no console.
        // System       → classe que fornece recursos de E/S
        // .            → operador para acessar membros da classe
        // out          → objeto que representa a saída padrão (console)
        // .            → operador para acessar membros do objeto
        // println      → método que imprime texto e quebra a linha
        // (            → inicia lista de argumentos
        // "Pode dirigir? "→ literal de String para mensagem fixa
        // +            → operador de concatenação de Strings
        // podeDirigir → variável booleana convertida em String
        // )            → fecha lista de argumentos
        // ;            → finaliza a instrução
        System.out.println("Pode dirigir? " + podeDirigir);

        // Esta linha imprime “Pode viajar sozinho? ” seguido do 
        //			valor de podeViajarSozinho.
        System.out.println("Pode viajar sozinho? " + podeViajarSozinho);

        // Esta linha imprime “Não tem carteira? ” seguido do 
        //			valor de naoTemCarteira.
        System.out.println("Não tem carteira? " + naoTemCarteira);
        
    } // fecha o método mostrarOperadoresLogicos

}