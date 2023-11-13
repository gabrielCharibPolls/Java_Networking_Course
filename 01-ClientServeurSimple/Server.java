////////////////////////////////////////////////////////////////////////////////
//les import que on a besoin 
////////////////////////////////////////////////////////////////////////////////

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////////
        //esseyer de faire une connection entre serveur socket et client socket 
        ////////////////////////////////////////////////////////////////////////////////


        try{
            //ouvrire un socket de type serveur au port 6666
            ServerSocket serverSocket = new ServerSocket(6666);

            //instanter un soket client et se connecter un socket server 
            Socket socket = serverSocket.accept();

            //cree les l'input et output steams 

            BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));

            BufferedWriter out = new BufferedWriter( new OutputStreamWriter(socket.getOutputStream()));


            //lire les donens du client 


            //lire les donne qui rentre dans le serveur 
            String line = in.readLine();
            System.out.println("data client "+ line);
            

            out.write("i am server ");
            out.newLine();
            out.flush();

            //fermer tout les ports 

            socket.close();
            serverSocket.close();
            in.close();
            out.close();    




        //////////////////////////////////////////////////////////////////////////////
        //IOException utiliser pour les exeption avec les entres et sorties 
        //////////////////////////////////////////////////////////////////////////////
        }catch(IOException e){
            System.out.println(e);

        }
    }
}
