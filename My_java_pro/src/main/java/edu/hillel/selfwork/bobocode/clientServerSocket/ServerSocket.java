package edu.hillel.selfwork.bobocode.clientServerSocket;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ServerSocket {
    @SneakyThrows
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();

        CompletableFuture.runAsync(() -> {
            while (true) {
                System.out.println("Unique users : " + users.size());
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(8899)) {
            while (true) {
                try (Socket client = serverSocket.accept()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    String line = bufferedReader.readLine();
                    System.out.println(client.getInetAddress().getHostAddress() + line);
                } catch (Exception e) {
                    System.out.println("Oops");
                }
            }
        }
    }
}
