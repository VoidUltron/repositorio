package CadastroCarro;


public class Carrolista {
	public static void main(String [] args){ 

		Carro meuCarro = new Carro();
		
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Renaut";
		meuCarro.nome = "Duster";
		meuCarro.modelo = "novo";
		
		
	System.out.println(meuCarro.anoDeFabricacao + "/" + meuCarro.cor + "/" + meuCarro.fabricante + "/" + meuCarro.modelo + "/" + meuCarro.nome  );
	}
	
	
}
