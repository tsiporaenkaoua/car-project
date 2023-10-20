package pojo;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Voiture> lesVoitures;
		
	//constructeur, il sera utiliser avec un "new" qui le precede et s'occupe de créer un objet
	public Garage() {
		this.lesVoitures = new ArrayList<>();
	}
	
	public Garage(List<Voiture> lesVoitures) {
		this.lesVoitures = lesVoitures;
	}
	
	
	public List<Voiture> getLesVoitures() {
		return lesVoitures;
	}

	public void setLesVoitures(List<Voiture> lesVoitures) {
		this.lesVoitures = lesVoitures;
	}

	public boolean addVoiture(Voiture voiture) {
		return this.lesVoitures.add(voiture);
	}
	
	//permet de représenter textuellement un objet
	 @Override
	    public String toString(){
	        return this.lesVoitures.toString();
	    }
	
	 
	 
	 
	 

}
