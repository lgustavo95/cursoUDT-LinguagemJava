package aula04_progr_estruturada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pag_competicao {

	public static void main(String[] args) {
		
		int opcao = 0;
		double valorInscricao = 0;
		String kit[] = {"medalha","blusa","boné","ecobag"};
		List<String> kitParticipante = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("qual opção deseja aderir?");
		opcao = scan.nextInt();
		
		switch(opcao) {
		
		case 1: valorInscricao = 100;
		        kitParticipante.add(kit[0]);
		        break;
		
		case 2: valorInscricao = 150;
                kitParticipante.add(kit[0]);
                kitParticipante.add(kit[1]);
                break;
		
		case 3: valorInscricao = 180;
                kitParticipante.add(kit[0]);
                kitParticipante.add(kit[1]);
                kitParticipante.add(kit[2]);
                break;
        
		case 4: valorInscricao = 200;
                kitParticipante.add(kit[0]);
                kitParticipante.add(kit[1]);
                kitParticipante.add(kit[2]);
                kitParticipante.add(kit[3]);
                break;
                
		case 5: valorInscricao = 220;
        		kitParticipante = Arrays.asList(kit);
        		break;
        		
        default: System.out.println("invalido");
		}
		System.out.println("valor da inscrição " + valorInscricao);
		kitParticipante.stream().forEach(System.out::println);
		
		scan.close();
	}
}