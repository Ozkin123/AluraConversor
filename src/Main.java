import ConectionApi.HttpConection;

import static IUMenu.Menu.*;

public class Main {
    public static void main(String[] args) {

         HttpConection httpConection = new HttpConection();
         httpConection.createRequest("USD","EUR",1000.0000000);



    }
}