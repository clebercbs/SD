// Prática: Modelo de Referência e Arquitetura Cliente-Servidor
// Disciplina: Sistemas Distribuídos
// Linguagem: Java

/**
 * Objetivo:
 * Implementar um sistema simples baseado na arquitetura cliente-servidor.
 * O servidor deverá fornecer um serviço de saudação. O cliente se conectará ao servidor,
 * enviará uma mensagem, e o servidor responderá com uma saudação personalizada.
 */


// Classe Servidor
import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        int porta = 12345; // Porta para o servidor escutar
        
        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor iniciado na porta " + porta);

            while (true) {
                // Aguardar conexão de um cliente
                Socket socket = servidorSocket.accept();
                System.out.println("Cliente conectado: " + socket.getInetAddress());

                // Criar streams para comunicação
                InputStream entrada = socket.getInputStream();
                BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));
                OutputStream saida = socket.getOutputStream();
                PrintWriter escritor = new PrintWriter(saida, true);

                // Ler mensagem do cliente
                String mensagem = leitor.readLine();
                System.out.println("Mensagem recebida: " + mensagem);

                // Responder ao cliente
                String resposta = "Olá, " + mensagem + "! Bem-vindo ao servidor.";
                escritor.println(resposta);

                // Fechar conexão com o cliente
                socket.close();
                System.out.println("Conexão com o cliente encerrada.");
            }
        } catch (IOException e) {
            System.out.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}