package pro.sky.calculatorhw05;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String welcome(){
        return "Добро пожаловать в калькулятор.";
    }
}
