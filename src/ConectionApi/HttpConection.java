package ConectionApi;

import DTOCurrency.CurrencyToShow;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class HttpConection {


    public static void createRequest(String baseCurrency,String targetCurrency, double value){

        DecimalFormat decimalFormat = new DecimalFormat("####.####");
        String endPoint = "https://v6.exchangerate-api.com/v6/acf25c06e7032df2e19b163b/pair/"+baseCurrency+"/"+targetCurrency+"/"+decimalFormat.format(value);
         try{

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endPoint))
                .build();

        HttpResponse<String> response = null;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

             Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


             CurrencyToShow currencyToShow = gson.fromJson(json,CurrencyToShow.class);
             System.out.println(currencyToShow);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }



}
