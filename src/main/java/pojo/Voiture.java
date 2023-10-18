package pojo;

public class Voiture { 
	
	//attributs
	Energie energie;//hydrogene, essence, electrique, diesel, gaz,mecanique
	String nom;
	
	//constructeur/plan
	public Voiture() {
		//initialisation des elements
		this.energie = Energie.ESSENCE;
		this.nom = "k-2000";
	}

	
	//Getter & setter de l'attribut energie
	public Energie getEnergie() {
		return energie;
	}

	public void setEnergie(Energie energie) {
		this.energie = energie;
	}

	
	@Override
	public String toString() {
	return "Ma voiture tourne au "+ energie + " et elle se nomme " + nom;	
	}
}
