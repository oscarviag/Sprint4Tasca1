package cat.itacademy.barcelonactiva.viagarcia.oscar.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/HelloWorld")
	public static String saluda(@RequestParam(required = false, defaultValue = "UNKNOWN")  String nom) {
		return "Hola, "+ nom + ". Est�s executant un projecte Maven";
			
	}
	
	@GetMapping(value ={"/HelloWorld2", "/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable(required = false) String nom) {
		
		if (nom == null ) {nom = "UNKNOWN";};
		return "Hola, "+ nom + ". Est�s executant un projecte Maven";
			
	}

}
