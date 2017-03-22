package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {

		// declaration
		Comparator<Personne> compNom = new Comparator<Personne>() {

			@Override
			public int compare(Personne o1, Personne o2) {
				// TODO Auto-generated method stub
				if (o1.getNom().equals(o2.getNom())) {
					return o1.getPrenom().compareTo(o2.getPrenom());
				} else {
					return o1.getNom().compareTo(o2.getNom());
				}
			}

		};

		Comparator<Personne> compId = new Comparator<Personne>() {

			@Override
			public int compare(Personne o1, Personne o2) {
				// TODO Auto-generated method stub
				return ((Integer) o1.getId()).compareTo((Integer) o2.getId());
			}

		};

		SortedSet<Personne> set = new TreeSet<Personne>(compNom);
		SortedSet<Personne> set2 = new TreeSet<Personne>(compNom.reversed());

		SortedSet<Personne> set3 = new TreeSet<Personne>(compId);
		SortedSet<Personne> set4 = new TreeSet<Personne>(compId.reversed());

		// creation des objets personnes
		Personne p1 = new Personne(1, "Patoulatchi", "Cindy");
		Personne p2 = new Personne(2, "Robichet", "Robert");
		Personne p3 = new Personne(3, "Gosling", "James");
		Personne p4 = new Personne(4, "Patoulatchi", "Marcel");

		// ajout des personnes a la collection
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		set2.addAll(set);
		set3.addAll(set);
		set4.addAll(set);

		// parcourir et afficher la collection
		System.out.println("----------------- NOM ASCENDANT --------------------");
		for (Personne p : set) {
			System.out.println(p);
		}

		System.out.println("----------------- NOM DESCENDANT -------------------");
		for (Personne p : set2) {
			System.out.println(p);
		}

		System.out.println("----------------- ID ASCENDANT ---------------------");
		for (Personne p : set3) {
			System.out.println(p);
		}
		

		System.out.println("----------------- ID DESCENDANT --------------------");
		for (Personne p : set4) {
			System.out.println(p);
		}

	}

}
