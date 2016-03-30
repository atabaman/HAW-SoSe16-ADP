package ADT;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tb_user on 3/30/2016.
 */
public class ADTListeTest {

    private ADTListe liste;

    @Before
    public void setUp(){
        liste = ADTListe.create();
    }

    @Test
    public void create() throws Exception {
        assertNotNull(liste);
    }

    @Test
    public void isEmpty() throws Exception {
        assertTrue(liste.isEmpty());
    }

    @Test
    public void equal() throws Exception {

    }

    @Test
    public void laenge() throws Exception {

    }

    @Test
    public void insert() throws Exception {
        assertTrue(liste.laenge() == 0);
        liste.insert(1,1);
        System.out.println(liste.elements[0]);
        System.out.println(liste.elements[1]);
        System.out.println(liste.elements[2]);
        System.out.println(liste.elements[3]);
        System.out.println();
        assertTrue(liste.laenge() == 1);
        liste.insert(2,2);
        System.out.println(liste.elements[0]);
        System.out.println(liste.elements[1]);
        System.out.println(liste.elements[2]);
        System.out.println(liste.elements[3]);
        System.out.println();
        assertTrue(liste.laenge() == 2);
        liste.insert(2,3);
        assertTrue(liste.laenge() == 3);
        System.out.println(liste.elements[0]);
        System.out.println(liste.elements[1]);
        System.out.println(liste.elements[2]);
        System.out.println(liste.elements[3]);

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void find() throws Exception {

    }

    @Test
    public void retrieve() throws Exception {

    }

    @Test
    public void concat() throws Exception {

    }
}