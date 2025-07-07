package ma.enset.Client;

public class ClientSOAP {
    public static void main(String[] args) {
        BanqueServiceService service = new BanqueServiceService();
        BanqueService proxy = service.getBanqueServicePort();

        double dh = proxy.conversion(100);
        System.out.println("100 Euro en DH : " + dh);

        Compte c = proxy.getCompte(5);
        System.out.println("Compte : code=" + c.getCode() + " solde=" + c.getSolde());
    }
}
