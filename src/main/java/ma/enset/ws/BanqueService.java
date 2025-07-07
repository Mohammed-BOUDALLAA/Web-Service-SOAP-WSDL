package ma.enset.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam(name = "mt") double mt) {
        return mt * 10.6; // Euro to DH
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9000);
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 90000));
        comptes.add(new Compte(2, 6000));
        comptes.add(new Compte(3, 12000));
        return comptes;
    }
}
