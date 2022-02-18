package academy.mindswap;

import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket socket;

    public Client() throws IOException {
        int serverPort = 8080;
        socket = new Socket("localHost", serverPort);
    }

    public static void main(String[] args) throws IOException {

        while (!socket.isClosed()) {

            BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader sockIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String consoleMessage = consoleIn.readLine();

            if (consoleMessage == null) {
                socket.close();
                break;
            }

            sockOut.write(consoleMessage);
            sockOut.newLine();
            sockOut.flush();

            System.out.print(sockIn.readLine());
        }
    }
}
