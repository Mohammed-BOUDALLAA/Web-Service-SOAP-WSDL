package ma.enset;

import javax.xml.ws.Endpoint;

import  javax.xml.ws.Endpoint;

public class ServeurJaxWS {
    public static void main(String[] args) {
        String url = "http://localhost:8099/BanqueWS";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web Service deployed at: " + url + "?wsdl");
    }
}