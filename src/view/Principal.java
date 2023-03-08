package view;

import controller.CorridaDeSapos;

public class Principal {

	public static void main(String[] args) {
	for(int i=0;i<5;i++) {
		CorridaDeSapos sapo = new CorridaDeSapos();
		sapo.start();
	}
	}

}
