package aula06_gui;

import java.util.List;

public class Aula08_testeConnection {

	public static void main(String[] args) {
		
		Aula08_ContatoDao dao = new Aula08_ContatoDao();
		
		Aula08_Contato c1 = new Aula08_Contato("Johhan","Baerbock","85966667777");
		
		c1.setId(3);
		//dao.salvarContato(c1);
		//dao.updateContato(c1);
		//dao.deleteContato(2L);
		
		//List<Aula08_Contato> contatos = dao.listarContatos();
		
		//contatos.stream().forEach(System.out::println);
		
		Aula08_Contato c2 = dao.buscarContatoPorId(5);
		System.out.println(c2);
	}

}