public class EscopoExemplo {
    // Escopo de Classe (Variáveis de Instância)
    private int variavelDeClasse = 10;

    // Método principal para testar a classe
    public static void main(String[] args) {
        EscopoExemplo exemplo = new EscopoExemplo();
        exemplo.metodoExemplo();
    }

    // Método para demonstrar escopo de método e fluxo
    public void metodoExemplo() {
        // Escopo de Método (Variáveis Locais)
        int variavelDeMetodo = 20;

        // Exibindo as variáveis de classe e de método
        System.out.println("Variável de Classe: " + variavelDeClasse);
        System.out.println("Variável de Método: " + variavelDeMetodo);

        // Escopo de Bloco de Fluxo (Dentro de um bloco de código)
        for (int i = 0; i < 5; i++) {
            // Variável local ao bloco de fluxo
            int variavelDeBloco = i * 2;
            System.out.println("Dentro do bloco de fluxo, i: " + i + ", variavelDeBloco: " + variavelDeBloco);
        }

        // Tentativa de acessar variavelDeBloco fora do bloco de fluxo
        // System.out.println(variavelDeBloco); // Isso causará um erro de compilação
    }
}
