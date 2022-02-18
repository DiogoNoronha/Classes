package academy.mindswap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private static int serverPort = 8080;

    /*public Server(){
        serverPortNumber++;
    }*/

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start(serverPort);
    }

    private void start(int serverPortNumber) throws IOException {

        System.out.println("Server starting...");

        ExecutorService clientPool = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(serverPortNumber);

        while (true) {

            Socket socket = serverSocket.accept();
            ServerClient serverClient = new ServerClient(socket);


        }

    }


    public class ServerClient implements Runnable {

        private Socket clientSocket;

        public ServerClient(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {

            while (true) {
                try {
                    BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    BufferedReader sockIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
