import ConectionApi.HttpConection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {

        HttpConection httpConection = new HttpConection();

        httpConection.createRequest("EUR","USD",1000);




    }
}