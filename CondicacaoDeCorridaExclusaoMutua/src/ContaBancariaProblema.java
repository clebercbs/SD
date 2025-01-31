public class ContaBancariaProblema {
    private static double saldo = 1000.0;

    public static void main(String[] args) {
        new Thread(() -> retirada("Usuário 1", 100)).start();
        new Thread(() -> retirada("Usuário 2", 100)).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { // Corrigindo a captura da exceção
            e.printStackTrace();
        }

        System.out.println("Saldo final: " + saldo);
    }

    public static void retirada(String usuario, double valor) {
        double saldoAtual = saldo;
        System.out.println(usuario + " está tentando tirar " + valor);
        saldoAtual -= valor;
        try {
            Thread.sleep(100); // Adicionado o ponto e vírgula correto
        } catch (InterruptedException e) { // Captura da exceção correta
            e.printStackTrace();
        }
        saldo = saldoAtual; // Problema de condição de corrida ainda existe
        System.out.println(usuario + " retirou " + valor + ". Saldo atual: " + saldo);
    }
}