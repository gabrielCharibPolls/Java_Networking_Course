import java.io.IOException;
import java.net.InetAddress;

///////////////////////////////////////////////////////////////////////////////
///pour avoir les adres host name ou host adress  il faut utilise inet adress
//////////////////////////////////////////////////////////////////////////////


public class Ex1 {

//////////////////////////////////////////////////////////////////////////////////////////////////////
////quand on utilise ce genre de methode ça peut declacher une erreur donc il faut utilise IOExeption
////////////////////////////////////////////////////////////////////////////////////////////////////

public static void main(String[] args) throws IOException {
    log("google.be", InetAddress.getByName("google.be"));
    log("8.8.8.8", InetAddress.getByAddress(new byte[] {8,8,8,8}));
}


private static void log (String sAdres_search, InetAddress a_Address){
    System.out.println("Search terme"+sAdres_search+"':");
    System.out.println("gethostneameAdress() = "+ a_Address.getHostAddress()+"");
    System.out.println("getHostName() == " + a_Address.getHostName());
    System.out.println();
}

}