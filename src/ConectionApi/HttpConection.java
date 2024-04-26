package ConectionApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpConection {


    public void createRequest(String baseCurrency,String targetCurrency, double value){


        String endPoint = "https://v6.exchangerate-api.com/v6/acf25c06e7032df2e19b163b/pair/"+baseCurrency+"/"+targetCurrency+"/"+value;
         try{

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endPoint))
                .build();

        HttpResponse<String> response = null;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

             System.out.println(response.body());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }



}
