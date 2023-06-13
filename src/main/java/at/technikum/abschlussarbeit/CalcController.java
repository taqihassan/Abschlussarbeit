package at.technikum.abschlussarbeit;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {

    static int cnt = 0;
    @GetMapping("/api/digitsum")
    public static int getSum(@RequestParam ("number") int number){
        cnt++;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    @GetMapping("/api/digitsum/usage")
    public static int getUsage(){
        if (cnt > 0)
            cnt = cnt-1;
        return cnt;
    }



}
