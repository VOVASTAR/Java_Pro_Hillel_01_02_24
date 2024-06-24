package edu.hillel.selfwork.bobocode.clientServerSocket;

import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    @SneakyThrows
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 8899)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String message = "Hello Boba \n";
            bufferedWriter.write(message);
            bufferedWriter.flush();
        }
    }
}
