package wizut.tpsi.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
public class CalculatorService {
    
    
    public int add(int a, int b)
    {
        return a + b;
    }
    
    public int subtract(int a, int b)
    {
        return a - b;
    }
    
    public int multiply(int a, int b)
    {
        return a * b;
    }
    
    public int calculate(int x, int y, String operation)
    {
        switch(operation)
        {
            case "+":
                return add(x,y);
            case "-":
                return subtract(x,y);
            case "*":
                return multiply(x,y);
        }
        throw new IllegalArgumentException("Nieznana operacja: " + operation);
    }
}
