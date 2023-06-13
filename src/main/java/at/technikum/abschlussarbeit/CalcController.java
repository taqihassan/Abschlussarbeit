package at.technikum.abschlussarbeit;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {
    @GetMapping("/api/digitsum")
    public static int getSum(@RequestParam ("number") int number){
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }


}
