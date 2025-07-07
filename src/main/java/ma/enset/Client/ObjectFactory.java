package ma.enset.Client;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {}

    public Compte createCompte() {
        return new Compte();
    }
}

