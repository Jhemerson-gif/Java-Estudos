// Declara que esta classe faz parte do pacote chamado "logica".
// Pacotes em Java servem para organizar o código de forma hierárquica e lógica.
// É como uma pasta onde ficam agrupadas classes com finalidades semelhantes.
package logica;

/*
 * ==========================
 * Aula: Comentários em Java
 * ==========================
 *
 * 1. Comentário de linha única 
 * 2. Comentário de múltiplas linhas
 */
public class ComentariosJava {

    /*
     * Este é o método `main`, o ponto de entrada de qualquer programa Java.
     * A execução do programa sempre começa por aqui.
     *
     * - public: torna o método acessível de qualquer lugar.
     * - static: permite executar este método sem precisar criar um objeto da classe.
     * - void: significa que o método não retorna nenhum valor.
     * - String[] args: parâmetro que recebe argumentos da linha de comando (vetor de Strings).
     */
    public static void main(String[] args) {
    	
    	

        // =====================================================
        // Comentário de linha única:
        // Serve para adicionar explicações breves no código.
        // Pode ser usado acima da linha ou ao lado dela.
        // Não interfere na execução do programa.
        // =====================================================

        // Exibe uma mensagem no console sobre o uso de comentário de linha única.
    	// "System" é uma classe da biblioteca padrão do Java.
    	// "out" é um atributo estático da classe System, representando a 
    	//			saída padrão (geralmente o console).
    	// "println" é um método que imprime uma linha de texto, adicionando uma 
    	//			quebra de linha automaticame
        System.out.println("Este é um exemplo de comentário de linha única."); // Comentário ao lado da instrução

        // =====================================================
        // Comentário de múltiplas linhas:
        // Exibe uma mensagem explicando o uso de comentários de múltiplas linhas.
        System.out.println("Este é um exemplo de comentário de múltiplas linhas."); 

        /*
         * Este é um comentário real de múltiplas linhas.
         * Tudo o que estiver entre "/*" e "* /" (sem espaço) será ignorado pelo compilador.
         * Pode ser usado para explicar blocos inteiros, desativar partes do código,
         * 			ou até comentar instruções temporariamente, como neste exemplo abaixo:
         *
         * System.out.println("Esta linha está comentada e não será executada.");
         */
        
      
        
    }

}