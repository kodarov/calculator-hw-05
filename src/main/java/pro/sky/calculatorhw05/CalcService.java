package pro.sky.calculatorhw05;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double plus(Double a, Double b) {
        return a + b;
    }

    public double minus(Double a, Double b) {
        return a - b;
    }

    public double multiply(Double a, Double b) {
        return a * b;
    }

    public double divide(Double a, Double b) {
        return a / b;
    }

}
