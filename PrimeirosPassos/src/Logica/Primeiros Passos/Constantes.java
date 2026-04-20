// Define o pacote onde esta classe está 
//			localizada, organizando-a em grupos lógicos.
// package  → palavra reservada que inicia a declaração de pacote
// logica   → nome do pacote que agrupa classes relacionadas
package logica;

/*  
 * O que são constantes?  
 * Constantes são similares às variáveis, mas com uma 
 * 			diferença muito importante:  
 * uma vez definido, o valor de uma constante nunca pode 
 * 			ser alterado durante a execução.  
 * Em Java, usamos "final" para declarar constantes, e por 
 * 			convenção seus nomes ficam em MAIÚSCULAS.  
 */

// Declara a classe pública chamada "Constantes", 
// 			que serve como molde do programa.
// public   → modificador de acesso que permite visibilidade a 
//			partir de qualquer outra classe
// class    → palavra reservada que inicia a definição de classe
// Constantes → nome da classe, deve corresponder ao nome do 
//			arquivo Constantes.java
public class Constantes {

    // Inicia o método principal, ponto de entrada da aplicação Java.
    // public       → torna o método acessível de qualquer lugar
    // static       → vincula o método à classe, dispensando criar instâncias
    // void         → indica que não retorna valor algum
    // main         → nome fixo do método principal em Java
    // String[] args→ parâmetro como vetor de Strings, recebe argumentos de linha de comando
    public static void main(String[] args) {

        // Declara a constante PI, que representa o valor de π e não pode ser alterada.
        // final    → define que o valor não pode ser modificado após atribuição
        // double   → tipo primitivo para números com casas decimais
        // PI       → nome da constante (sempre em MAIÚSCULAS por convenção)
        // =        → operador de atribuição que fixa o valor inicial
        // 3.14159  → literal de ponto flutuante atribuído à constante
        // ;        → finaliza a instrução
        final double PI = 3.14159;

        // Declara a constante ANO_ATUAL, representando o ano fixo do exemplo.
        // final       → define que o valor não pode ser modificado após atribuição
        // int         → tipo primitivo para números inteiros
        // ANO_ATUAL   → nome da constante, convenção em MAIÚSCULAS
        // =           → operador de atribuição
        // 2025        → literal inteiro atribuído à constante
        // ;           → finaliza a instrução
        final int ANO_ATUAL = 2025;

        // Imprime no console o texto "Valor de PI: " concatenado com o valor da constante PI.
        // System      → classe com recursos de sistema, incluindo E/S
        // .out        → saída padrão (console)
        // .println()  → método que imprime texto e adiciona quebra de linha
        // (           → inicia lista de argumentos
        // "Valor de PI: "→ literal de String fixo
        // +           → operador de concatenação de String com valor
        // PI          → constante cujo valor será convertido em String
        // )           → fecha lista de argumentos
        // ;           → finaliza a instrução
        System.out.println("Valor de PI: " + PI);

        // Imprime no console o texto "Ano atual: " concatenado com o valor da constante ANO_ATUAL.
        // A estrutura de comentários é igual à linha anterior, apenas trocando a mensagem e a constante.
        System.out.println("Ano atual: " + ANO_ATUAL);

    } // fim do método main

} // fim da classe Constantes


/* Explicação das constantes:
 
A palavra-chave final diz que essa variável é uma constante.

Por convenção, constantes são escritas em letras 
			maiúsculas com _ para separar palavras.
 */