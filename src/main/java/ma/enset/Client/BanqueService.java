package ma.enset.Client;


import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "BanqueServiceService", targetNamespace = "http://ws.enset.ma/")
public interface BanqueService {

    @WebMethod
    double conversion(@WebParam(name = "mt") double mt);

    @WebMethod
    Compte getCompte(@WebParam(name = "code") int code);

    @WebMethod
    List<Compte> getComptes();
}

