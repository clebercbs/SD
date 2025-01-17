// Prática: Modelo de Referência e Arquitetura Cliente-Servidor
// Disciplina: Sistemas Distribuídos
// Linguagem: Java

/**
 * Objetivo:
 * Implementar um sistema simples baseado na arquitetura cliente-servidor.
 * O servidor deverá fornecer um serviço de saudação. O cliente se conectará ao servidor,
 * enviará uma mensagem, e o servidor responderá com uma saudação personalizada.
 */


// Classe Cliente
import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        String servidor = "localhost"; // Endereço do servidor
        int porta = 12345; // Porta do servidor

        try (Socket socket = new Socket(servidor, porta)) {
            System.out.println("Conectado ao servidor: " + servidor);

            // Criar streams para comunicação
            OutputStream saida = socket.getOutputStream();
            PrintWriter escritor = new PrintWriter(saida, true);
            InputStream entrada = socket.getInputStream();
            BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));

            // Enviar mensagem para o servidor
            String mensagem = "Aluno";
            escritor.println(mensagem);
            System.out.println("Mensagem enviada: " + mensagem);

            // Ler resposta do servidor
            String resposta = leitor.readLine();
            System.out.println("Resposta do servidor: " + resposta);
        } catch (IOException e) {
            System.out.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
