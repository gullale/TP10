package main;

import model.DemanderFormation;
import model.Employe;
import model.Manager;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e = new Employe("bou", "bill", 1);
		Manager m = new Manager("di", "oki", 2);
		DemanderFormation df = new DemanderFormation("java", "accorde", "10.02.2017");

		e.demanderFormation("hisyore");
		
	}

}
