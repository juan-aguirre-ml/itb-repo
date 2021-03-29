package Romanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/{decimal}")
    public String convert2Roman(String str){
        int decimal = Integer.parseInt(str);
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
        return roman.toString();
    }
}
