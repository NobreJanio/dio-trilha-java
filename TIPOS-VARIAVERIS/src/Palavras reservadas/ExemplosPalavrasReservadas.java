// Pacotes
package exemplos;

import java.util.ArrayList;
import java.util.List;

// Modificadores de Classe
public class ExemplosPalavrasReservadas {

    // Modificadores de Acesso
    private int variavelPrivada;
    protected int variavelProtegida;
    public int variavelPublica;

    // Modificadores de Método
    public static void main(String[] args) {
        // Modificadores de Variável
        final int constante = 10;
        
        // Tipos Primitivos
        int inteiro = 5;
        double decimal = 10.5;
        boolean booleano = true;

        // Controle de Fluxo
        if (inteiro < 10) {
            System.out.println("inteiro é menor que 10");
        } else {
            System.out.println("inteiro é 10 ou maior");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // Tratamento de Exceções
        try {
            int resultado = inteiro / 0; // Isso causará uma exceção
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }

        // Uso de List e interface
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Palavras Reservadas");
        for (String item : lista) {
            System.out.println(item);
        }
    }

    // Exemplo de método synchronized
    public synchronized void metodoSincronizado() {
        // Algum código
    }
}

// Exemplo de enum
enum DiasDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

// Exemplo de interface
interface ExemploInterface {
    void metodoInterface();
}

// Exemplo de classe abstrata
abstract class ExemploClasseAbstrata {
    abstract void metodoAbstrato();
}

// Explicação do Código
// Pacotes e Importações: package e import são usados para organizar classes e pacotes.
// Modificadores de Classe: public é usado para tornar a classe acessível de qualquer lugar.
// Modificadores de Acesso: private, protected e public são usados para controlar o acesso aos membros da classe.
// Modificadores de Método e Variável: static, final, e synchronized são usados para definir métodos e variáveis.
// Tipos Primitivos: int, double, boolean são exemplos de tipos primitivos.
// Controle de Fluxo: if, else, for, e try-catch-finally são usados para controle de fluxo e tratamento de exceções.
// Interfaces e Classes Abstratas: interface e abstract são usados para definir contratos e comportamentos abstratos.
// Enums: enum é usado para definir um conjunto de constantes nomeadas.