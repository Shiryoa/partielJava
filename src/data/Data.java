package data;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	private List<String> ListJoueur = new ArrayList<String>();

	public List<String> getListJoueur() {
		return ListJoueur;
	}

	public void setListJoueur(List<String> listJoueur) {
		this.ListJoueur = listJoueur;
	}
	
	public String toString() {
		StringBuilder sting = new StringBuilder();
		sting.append("\n Liste de joueurs participants:\n");
		for(int i=0; i < ListJoueur.size(); i++) {
			sting.append(i).append(":").append(ListJoueur.get(i)).append("\n");
		}
		return sting.toString();
	}
}
