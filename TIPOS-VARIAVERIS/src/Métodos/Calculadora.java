public class Calculadora {
    // Atributo privado
    private double resultado;

    // Construtor público
    public Calculadora() {
        this.resultado = 0.0;
    }

    // Método público para somar
    public void somar(double valor1, double valor2) {
        resultado = valor1 + valor2;
        exibirResultado(); // Chamando um método privado
    }

    // Método público para subtrair
    public void subtrair(double valor1, double valor2) {
        resultado = valor1 - valor2;
        exibirResultado();
    }

    // Método protegido para multiplicar
    protected void multiplicar(double valor1, double valor2) {
        resultado = valor1 * valor2;
        exibirResultado();
    }

    // Método privado para dividir
    private void dividir(double valor1, double valor2) {
        if (valor2 != 0) {
            resultado = valor1 / valor2;
        } else {
            System.out.println("Erro: Divisão por zero!");
            resultado = 0.0;
        }
        exibirResultado();
    }

    // Método público para acessar a divisão
    public void realizarDivisao(double valor1, double valor2) {
        dividir(valor1, valor2); // Chamando o método privado
    }

    // Método privado para exibir o resultado
    private void exibirResultado() {
        System.out.println("Resultado: " + resultado);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somar(10, 5);          // Método público
        calc.subtrair(10, 5);       // Método público
        calc.multiplicar(10, 5);    // Método protegido (acessível dentro do mesmo pacote)
        calc.realizarDivisao(10, 5); // Método público que chama o método privado

        // Tentativas de acessar métodos privados diretamente (irão falhar se descomentadas)
        // calc.dividir(10, 5);    // Erro de compilação
        // calc.exibirResultado(); // Erro de compilação
    }
}