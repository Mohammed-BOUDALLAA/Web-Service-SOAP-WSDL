package ma.enset.Client;


import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


@WebServiceClient(
        name = "BanqueServiceService",
        targetNamespace = "http://ws.enset.ma/",
        wsdlLocation = "http://localhost:8099/BanqueWS?wsdl")
public class BanqueServiceService extends Service {

    private final static URL BANQUESERVICE_WSDL_LOCATION;
    private final static QName BANQUESERVICE_QNAME =
            new QName("http://ws.enset.ma/", "BanqueServiceService");

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8099/BanqueWS?wsdl");
        } catch (Exception e) {
            e.printStackTrace();
        }
        BANQUESERVICE_WSDL_LOCATION = url;
    }

    public BanqueServiceService() {
        super(BANQUESERVICE_WSDL_LOCATION, BANQUESERVICE_QNAME);
    }

    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        QName portQName = new QName("http://ws.enset.ma/", "BanqueServicePort");
        return super.getPort(portQName, BanqueService.class);
    }
}
