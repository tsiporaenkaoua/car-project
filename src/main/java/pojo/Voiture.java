package pojo;

public class Voiture {

    Energie energie;

    String nom;

    public Voiture(){
        this.energie = Energie.ESSENCE;
        this.nom = "K-2000";
    }
    
    //Constructeur pour les voitures electriques
    public Voiture(Energie energie) {
    	this.energie = energie;
    	this.nom = "K-2000";
    }

    //permet de ne pas retourner le code mémoire quand on veut observer dans le console (println())notre objet
    @Override
    public String toString(){
        return "Ma voiture est au " + energie + ", et elle s'appelle " + nom;
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