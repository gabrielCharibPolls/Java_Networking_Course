package tp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/////////////////////////////////////////////////////
/// cette exercie va se passe en 3 etapes 
//// 1 la requette 
///// 2 le client pour envoyer la requette 
///// 3 la reponse 
/////////////////////////////////////////////////////

public class Ex2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Crée une requête 
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dumvadi24.lv/robots.txt"))
                .build();

        // Crée un client HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Envoie la requête et obtient la réponse
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // Affiche le code de statut de la réponse
        System.out.println("Status: " + response.statusCode());

        // Affiche le corps de la réponse
        System.out.println("Body: " + response.body());
    }
}
