package local.romanos.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@GetMapping("/romano")
	public StringBuilder convert2Roman(@RequestParam(value = "decimal", defaultValue="") Integer decimal){
		//int decimal = Integer.parseInt(str);
		System.out.println("Integer: " + decimal);
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

		StringBuilder roman = new StringBuilder();

		for(int i=0;i<values.length;i++) {
			while(decimal >= values[i]) {
				decimal -= values[i];
				roman.append(romanLiterals[i]);
			}
		}
		return roman;
	}

}
