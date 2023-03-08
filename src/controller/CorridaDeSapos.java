package controller;

public class CorridaDeSapos  extends Thread{
	
	private int numero = 1;
	
	public  CorridaDeSapos () {
		this.numero = numero;
	}
 
	@Override
	public void run() {
		
		corrida();
	System.out.println("-"+ getId()+" " +numero+ "° lugar");
	numero = numero+1;
	}

	private void corrida() {
		int fim =50;
		int local=0;
		while ( fim > local) {
			int pulo = (int) (Math.random()*10);
			System.out.println("SAPO -"+getId()+ " pulou " +pulo+" metros");
			local+= pulo;
			try {
				sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		 }
}
