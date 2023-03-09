package controller;

//3) Fazer uma aplicação de uma corrida de sapos, com 5
//Threads, cada Thread controlando 1 sapo. Deve haver um
//tamanho máximo para cada pulo do sapo (em metros) e a
//distância máxima para que os sapos percorram. A cada salto,
//um sapo pode dar uma salto de 0 até o tamanho máximo do
//salto (valor aleatório). Após dar um salto, a Thread, para cada
//sapo, deve mostrar no console, qual foi o tamanho do salto e
//quanto o sapo percorreu. Assim que o sapo percorrer a
//distância máxima, a Thread deve apresentar que o sapo
//chegou e qual sua colocação.

public class CorridaDeSapos  extends Thread{
	
	public static int numero=1;
	
	public  CorridaDeSapos () {
		
	}
 
	@Override
	public void run() {
		
		corrida();
	System.out.println("Sapo# "+getId()+" " +numero+ "° lugar");
	numero++;
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
