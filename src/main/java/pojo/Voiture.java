package pojo;

public class Voiture {

    Energie energie;
    boolean state;
    String nom;
	private String theState;

    public Voiture(){
        this.energie = Energie.ESSENCE;
        this.nom = "K-2000";
        this.state= true;
    }
    
    //Constructeur pour les voitures electriques
    public Voiture(Energie energie) {
    	this.energie = energie;
    	this.nom = "K-2000";
    	this.state=true;
    }
    
    public Voiture(Energie energie, String isState, String name) {
    	this.energie = energie;
    	this.nom = name;
    	this.theState=isState;
    }

    //permet de ne pas retourner le code mémoire quand on veut observer dans le console (println())notre objet
    @Override
    public String toString(){
        return "Ma voiture est au " + energie + ", elle s'appelle " + nom + "et son état est "+ theState;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        System.out.println("non tu ne peux pas");
    }

    public String getNom() {
        return nom; 
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}