package g1.quizkampen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    //Variables
    int port = 12345;
    String hostName = "127.0.0.1"; //localHost


    //Konstruktor
    Client(){
        try(Socket adress = new Socket(hostName,port);

            ObjectOutputStream objectOut = new ObjectOutputStream(adress.getOutputStream());
            ObjectInputStream objectIn = new ObjectInputStream(adress.getInputStream())){

            //TODO Instatiate intro object
            //TODO instatiate custom response object
            //TODO create instance of logic for Response Object



        }
        catch(IOException e){
            System.out.println("IO ERROR");
        }
     /*   catch(ClassNotFoundException e){
            System.out.println("Objectets klass kunde inte hittas");
        }*/


    }

}
