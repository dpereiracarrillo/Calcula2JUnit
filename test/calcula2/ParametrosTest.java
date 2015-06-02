package calcula2;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParametrosTest {
   private Modelo mod;
   private float result;
   
   

   @Before
   public void initialize() {
   }

    public ParametrosTest(Modelo mod, float result) {
        this.mod = mod;
        this.result = result;
    }

  

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { new Modelo(5, 5, 1, 10),10}
         
      });
   }

   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + result);
      assertEquals(result,Logic.realizaOperacion(mod),0.0);
   }
}
