public class ExemplosOperadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        // Operadores de atribuição
        int c = 10;
        c += 5; // c = c + 5
        c -= 3; // c = c - 3
        c *= 2; // c = c * 2
        c /= 4; // c = c / 4
        c %= 2; // c = c % 2

        // Operadores relacionais
        boolean igual = (a == b);
        boolean diferente = (a != b);
        boolean maior = (a > b);
        boolean menor = (a < b);
        boolean maiorOuIgual = (a >= b);
        boolean menorOuIgual = (a <= b);

        // Operadores lógicos
        boolean andLogico = (a > b) && (b > 0);
        boolean orLogico = (a > b) || (b < 0);
        boolean naoLogico = !(a > b);

        // Operadores unários
        int d = +a;
        int e = -b;
        int incremento = ++a; // pré-incremento
        int decremento = --b; // pré-decremento

        // Operadores bitwise
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseComplemento = ~a;
        int deslocamentoEsquerda = a << 2;
        int deslocamentoDireita = a >> 2;
        int deslocamentoDireitaZero = a >>> 2;

        // Exibindo os resultados
        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        System.out.println("\nOperadores de Atribuição:");
        System.out.println("Resultado final de c: " + c);

        System.out.println("\nOperadores Relacionais:");
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);
        System.out.println("Menor ou Igual: " + menorOuIgual);

        System.out.println("\nOperadores Lógicos:");
        System.out.println("AND Lógico: " + andLogico);
        System.out.println("OR Lógico: " + orLogico);
        System.out.println("NÃO Lógico: " + naoLogico);

        System.out.println("\nOperadores Unários:");
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento: " + decremento);

        System.out.println("\nOperadores Bitwise:");
        System.out.println("AND Bitwise: " + bitwiseAnd);
        System.out.println("OR Bitwise: " + bitwiseOr);
        System.out.println("XOR Bitwise: " + bitwiseXor);
        System.out.println("Complemento Bitwise: " + bitwiseComplemento);
        System.out.println("Deslocamento à Esquerda: " + deslocamentoEsquerda);
        System.out.println("Deslocamento à Direita: " + deslocamentoDireita);
        System.out.println("Deslocamento à Direita com Zero: " + deslocamentoDireitaZero);
    }
}
