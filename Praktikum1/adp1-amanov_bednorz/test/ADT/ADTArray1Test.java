package ADT;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tb_user on 4/1/2016.
 */
public class ADTArray1Test {
    @Test
    public void initA() throws Exception {
        ADTArray1 array1 = ADTArray1.initA(10);

        assertNotNull(array1);

        assertTrue(array1.lengthA().equals(10));
    }

    @Test
    public void setA() throws Exception {
        ADTArray1 array1 = ADTArray1.initA(1);

        assertTrue(array1.getA(0).equals(0));

        array1.setA(0,1);

        assertTrue(array1.getA(0).equals(1));

        array1.setA(1,1);

        assertNull(array1.getA(1));
    }

    @Test
    public void getA() throws Exception {

    }

    @Test
    public void lengthA() throws Exception {
        ADTArray1 array1 = ADTArray1.initA(1);

        assertTrue(array1.lengthA().equals(1));
    }

    @Test
    public void equalA() throws Exception {

    }

}