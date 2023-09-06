package aula07_lambda;

import java.util.Arrays;
import java.util.List;

public class ExercicioLambda01 {

	public static void main(String[] args) {
		
		List<String> travelledPlaces = Arrays
				.asList("NewYork", "London", "RioDeJaneiro","PuntaCana","Paris");
		
		List<String> placesToKnow = Arrays
				.asList("Paris","Prague", "Amsterdam","Maldives","Tokyo","Morroco");
		
		placesToKnow.stream().filter(place -> !travelledPlaces.contains(place)).forEach(System.out::println);

	}

}
