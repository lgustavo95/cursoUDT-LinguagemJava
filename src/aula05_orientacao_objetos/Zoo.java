package aula05_orientacao_objetos;

public class Zoo {

	public static void main(String[] args) {
		
		//Animal animal1 = new Animal("carnivoro","subpolar", "urso polar", 4, 100,
				//false, "polo norte");
		
		Pets petCao = new Pets("pedigree","apartamento","duke",4,5,true,"China","shitzu");
		
		Silvestres silvestreLeao = new Silvestres("carne","savana","Simba",4,110,false,"Africa");
		
		System.out.println(petCao.som());
		System.out.println(petCao.getNome());
		System.out.println(silvestreLeao.som());
		
		System.out.println(Animal.getnumeroAnimais());
		
		/*animal1.tipoAlimento = "carnivoro";
		animal1.habitat = "subpolar";
		animal1.nome = "urso polar";
		animal1.patas = 4;
		animal1.tamanho = 100;
		animal1.domesticado = false;
		animal1.paisOrigem = "polo norte";*/
		
		
		/*animal1.setNome("urso negro");
		System.out.println(animalCao.getNome());
		System.out.println(animalCao);
		
		animal1.comer(); //imprimindo
		System.out.println(animalCao.caminhar()); //retornando
		*/
		
	}

}
