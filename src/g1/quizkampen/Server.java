package g1.quizkampen;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server() {
        while (true) {
            int portNumber = 12345;

            try {
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                MultiPairServer multi = new MultiPairServer(clientSocket);

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
