import junit.framework.TestCase;

public class TestCalculator extends TestCase {
    private Calculator calculator;
    public void escenario () {
        calculator = new Calculator();
    }
    public void testsumar(){
    	escenario ();
        assertTrue(calculator.sumar(2,2)==(2+2));
         
    }
    public void testsumar2(){
    	escenario ();
        assertNotNull(calculator.sumar(2,2));
         
    }
    public void testrestar(){
    	escenario ();
        assertTrue(calculator.restar(2,2)==(2-2));
        
    }
    public void testrestar2(){
    	escenario ();
        assertNotNull(calculator.restar(2,2));
        
    }
    public void testmultiplicar(){
    	escenario ();
        assertTrue(calculator.multiplicar(2,2)==(2*2));
        
    }
    public void testmultiplicar2(){
    	escenario ();
        assertNotNull(calculator.multiplicar(2,2));
        
    }
    public void testdividir(){
    	escenario ();
        assertTrue(calculator.dividir(2,2)==(2/2));
        
    }
    public void testdividir2(){
    	escenario ();
        assertNotNull(calculator.dividir(2,2));
        
    }
}
