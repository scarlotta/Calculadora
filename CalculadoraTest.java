import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    @org.junit.jupiter.api.Test
    void potencia() {
        Calculadora.potencia(0,0);
        assertEquals(0,Calculadora.dividir(0,0));
    }

    @Test
    void dividir(){
        assertEquals(true, Calculadora.dividirPrueba1(3,0));
    }
}