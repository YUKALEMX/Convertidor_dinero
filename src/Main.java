import Modelos.General;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double arg = 0;
        double bra = 0;
        double col = 0;
        double mxn = 0;
        double moned =0;

        String menu = """
                *--------------------------*
               
                Sea bienvenido/a al conversor de moneda!

                1) Dolar =>> Peso argentino
                2) Peso argentico =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar
                7) Dolar =>> Peso mexicano
                8) Peso mexicano =>> Dolar
                9) Salir
                Elija una opcion valida:
                *--------------------------*
                """;


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/611575e45497e9d98d6d4342/latest/USD"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
        System.out.println(json);
        Gson gson = new Gson();
        General moneda = gson.fromJson(json, General.class);




while (opcion != 9) {
    System.out.println(menu);
    opcion = teclado.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned * moneda.conversion_rates.getARS();
                System.out.println("El valor " + moned + " [USD] corresponde al valor final =>> "+arg+" [ARS]");
            }
            arg =0;
            moned =0;
         break;
        case 2:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned / moneda.conversion_rates.getARS();
                System.out.println("El valor " + moned + " [ARS] corresponde al valor final =>> "+arg+" [USD]");
            }
            arg =0;
            moned =0;
         break;
        case 3:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned * moneda.conversion_rates.getBRL();
                System.out.println("El valor " + moned + " [USD] corresponde al valor final =>> "+arg+" [BRL]");
            }
            arg =0;
            moned =0;
         break;
        case 4:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned / moneda.conversion_rates.getBRL();
                System.out.println("El valor " + moned + " [BRL] corresponde al valor final =>> "+arg+" [USD]");
            }
            arg =0;
            moned =0;
         break;
        case 5:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned * moneda.conversion_rates.getCOP();
                System.out.println("El valor " + moned + " [USD] corresponde al valor final =>> "+arg+" [COP]");
            }
            arg =0;
            moned =0;
         break;
        case 6:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned / moneda.conversion_rates.getCOP();
                System.out.println("El valor " + moned + " [COP] corresponde al valor final =>> "+arg+" [USD]");
            }
            arg =0;
            moned =0;
         break;
        case 7:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned * moneda.conversion_rates.getMXN();
                System.out.println("El valor " + moned + " [USD] corresponde al valor final =>> "+arg+" [MXN]");
            }
            arg =0;
            moned =0;
         break;
        case 8:
            System.out.println("Ingresa la cantidad que deseas convertir:");
            moned = teclado.nextDouble();
            if (moned < -1){
                System.out.println("El monto debe ser mayor a 0");
            } else {
                arg = moned / moneda.conversion_rates.getMXN();
                System.out.println("El valor " + moned + " [MXN] corresponde al valor final =>> "+arg+" [USD]");
            }
            arg =0;
            moned =0;
         break;
        case 9:
         System.out.println("Saliendo del programa, Gracias por usar el convertidor !!");
         break;
        default:
         System.out.println("Opcion no valida");


    }
}

    }
}