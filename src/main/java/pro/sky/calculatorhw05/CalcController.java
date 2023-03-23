package pro.sky.calculatorhw05;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null ) {
            return "ОШИБКА!";
        }
        return "num1 + num2 = " + calcService.plus(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "ОШИБКА!";
        }
        return "num1 - num2 = " + calcService.minus(a, b);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "ОШИБКА!";
        }
        return "num1 * num2 = " + calcService.multiply(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "ОШИБКА!";
        }
        if (b == 0) {
            return "Деление на 0!";
        }
        return "num1 / num2 = " + calcService.divide(a, b);
    }
}
