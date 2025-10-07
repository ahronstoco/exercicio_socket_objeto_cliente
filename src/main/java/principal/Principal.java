
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Principal {

    public static void main(String args[]) {
        try {
            Socket socket = new Socket("localhost", 4444);
            OutputStream dadossaida = socket.getOutputStream();
            ObjectOutputStream saida = new ObjectOutputStream(dadossaida);
            System.out.println("Cliente iniciado.");

            String opcao = "";
            while (!opcao.equals("9")) {
                opcao = JOptionPane.showInputDialog(" 1 - Leitura 9 - Sair");
                if (opcao.equals("1")) {
                    Cliente cliente = new Cliente();
                    cliente.leitura();
                    saida.writeObject(cliente);
                }
            }
            System.out.println("Cliente finalizado.");
        } catch (EOFException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
