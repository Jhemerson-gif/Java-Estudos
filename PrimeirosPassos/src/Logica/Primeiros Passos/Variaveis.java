// Esta linha indica que as classes definidas neste 
//			arquivo pertencem ao pacote “logica”,  
// package → palavra reservada que define o pacote 
//			onde as classes residem  
// logica → identificador do pacote; agrupa classes 
//			relacionadas por funcionalidade  
package logica;

/*
 * O que são variáveis?  
 * Variáveis são como "caixinhas" na memória do computador.  
 * Cada caixinha guarda um valor que pode ser alterado ao 
 * 			longo do tempo.  
 * Para criar uma variável em Java, você precisa:  
 * 1. Escolher um nome (ex: idade, altura, nome)  
 * 2. Informar o tipo do dado que ela irá armazenar (ex: int, 
 * 			double, String, boolean)  
 * 3. Atribuir um valor inicial (opcional, mas recomendado)  
 */
 
// Esta linha declara a classe pública chamada “Variaveis”,
//			que conterá todo o código  
// public → modificador de acesso que permite que qualquer
//			outra classe acesse esta classe  
// class  → palavra reservada que inicia a definição de uma classe  
// Variaveis → nome da classe; deve iniciar com letra maiúscula e 
//			corresponder ao nome do arquivo  
public class Variaveis {

    // Esta linha inicia o método principal do programa,
	//			ponto de entrada da aplicação  
    // Quando o programa é executado, essa é a primeira parte do código que roda  
    // public  → método acessível de qualquer outro local  
    // static  → método pertence à classe e não a uma instância  
    // void    → não retorna valor algum  
    // main    → nome fixo do método principal em Java  
    // String[] args → parâmetro que recebe argumentos de linha de comando  
    public static void main(String[] args) {

        // =======================================  
        // DECLARAÇÃO DE VARIÁVEIS  
        // =======================================

        // Esta linha declara uma variável inteira chamada “idade” e 
    	//			atribui o valor 25  
        // int    → tipo primitivo para números inteiros  
        // idade  → nome da variável; deve ser descritivo e em minúsculas  
        // =      → operador de atribuição que define o valor inicial  
        // 25     → literal inteiro atribuído à variável  
        // ;      → finaliza a instrução em Java  
        int idade = 25;

        // Esta linha declara uma variável de ponto flutuante 
    	//			chamada “altura” e atribui o valor 1.75  
        // double → tipo primitivo para números de dupla precisão (decimais)  
        // altura → nome da variável; indica medida de estatura  
        // =      → operador de atribuição  
        // 1.75   → literal de ponto flutuante em Java usa ponto como separador decimal  
        // ;      → finaliza a instrução  
        double altura = 1.75;

        // Esta linha declara uma variável de texto chamada “nome” e 
    	//			atribui o valor "João"  
        // String → tipo referência para sequência de caracteres (texto)  
        // nome   → identificador da variável; armazena um nome de pessoa  
        // =      → operador de atribuição  
        // "João" → literal de String; texto entre aspas duplas  
        // ;      → finaliza a instrução  
        String nome = "João";

        // Esta linha declara uma variável booleana chamada “estudando” e 
    	//			atribui o valor true  
        // boolean   → tipo primitivo para verdadeiro/falso 
        // estudando → nome da variável; indica estado de estudo  
        // =         → operador de atribuição  
        // true      → literal booleano que representa “verdadeiro”  
        // ;         → finaliza a instrução  
        boolean estudando = true;

        // =============================================  
        // EXIBINDO OS VALORES NO CONSOLE  
        // =============================================

        // Esta linha imprime no console o texto "Nome: " concatenado 
    	//			com o valor da variável nome  
        // System   → classe que representa o sistema no Java  
        // .        → operador que acessa membros da classe  
        // out      → campo estático que representa a saída padrão (console)  
        // .        → operador de acesso  
        // println  → método que imprime uma linha e pula para a próxima  
        // (        → inicia a lista de argumentos do método  
        // "Nome: " → literal de String para texto fixo  
        //  +       → operador de concatenação que une texto e valor de variável  
        // nome     → variável cujo valor será convertido para String  
        // )        → fecha a lista de argumentos  
        // ;        → finaliza a instrução  
        System.out.println("Nome: " + nome);

        // Esta linha imprime "Idade: " + valor de idade + " anos" no console  
        // System   → classe base para operações de E/S  
        // .out     → saída padrão  
        // .println → método para imprimir linha completa  
        // (        → início dos argumentos  
        // "Idade: "→ texto fixo  
        // +        → concatenação  
        // idade    → valor inteiro convertido em String  
        // +        → concatenação  
        // " anos"  → texto fixo indicando unidade  
        // )        → fim dos argumentos  
        // ;        → finaliza a instrução  
        System.out.println("Idade: " + idade + " anos");

        // Esta linha imprime "Altura: " + valor de altura + " metros" no console  
        // System    → classe utilitária  
        // .out      → canal de saída padrão  
        // .println  → imprime e quebra a linha  
        // (         → abre parênteses para argumentos  
        // "Altura: "→ texto  
        // +         → concatena texto e valor  
        // altura    → valor double convertido para String  
        // +         → concatena  
        // " metros" → texto fixo indicando unidade  
        // )         → fecha parênteses  
        // ;         → encerra instrução  
        System.out.println("Altura: " + altura + " metros");

        // Esta linha imprime "Está estudando? " + valor de estudando no console  
        // System        → classe de sistema  
        // .out          → saída padrão  
        // .println      → método de impressão com quebra de linha  
        // (             → abre argumentos  
        // "Está estudando? " → texto fixo  
        // +             → concatenação  
        // estudando     → valor booleano convertido para String  
        // )             → fecha argumentos  
        // ;             → finaliza a instrução  
        System.out.println("Está estudando? " + estudando);
        
    } // fim do método main

} // fim da classe Variaveis