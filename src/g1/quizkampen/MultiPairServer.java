package g1.quizkampen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MultiPairServer implements Runnable {

    //Variables
    private Socket clientSocket;

    //Konstruktor

    public MultiPairServer(Socket clientSocket) {
        Thread thread = new Thread(this);
        thread.start();
        this.clientSocket = clientSocket;

    }

    public void run() {
        try (ObjectOutputStream sendObject = new ObjectOutputStream(clientSocket.getOutputStream());
             ObjectInputStream receiveObject = new ObjectInputStream(clientSocket.getInputStream());) {

            //TODO fill in comunication with protocoll for Q&A generation


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error om med object send or read ");
        }

    }


}
