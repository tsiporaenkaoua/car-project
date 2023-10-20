	
package pojo;
	
public class VoitureElectrique extends Voiture{//heritage parce que c'est "une sorte de"
	
    public VoitureElectrique(){
        super(Energie.ELECTRIQUE);// le super ramene au constructeur. Ici ca va ramener au constructeur Voiture qui permettra de prendre en compte le parametre energie.
        ;
    }
}
			
