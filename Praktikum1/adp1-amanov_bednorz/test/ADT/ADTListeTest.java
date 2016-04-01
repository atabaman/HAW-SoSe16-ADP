package ADT;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Thomas Bednorz
 */
public class ADTListeTest {

    @Test
    public void create() throws Exception {
        ADTListe liste1 = ADTListe.create();
        assertNotNull(liste1);
        assertTrue(liste1.laenge().equals(0));
    }

    @Test
    public void isEmpty() throws Exception {
        ADTListe liste1 = ADTListe.create();

        assertTrue(liste1.isEmpty());

        liste1.insert(1,1);

        assertFalse(liste1.isEmpty());
    }

    @Test
    public void equal() throws Exception {
        ADTListe liste1 = ADTListe.create();
        ADTListe liste2 = ADTListe.create();

        liste1.insert(1,1);
        liste1.insert(2,2);
        liste1.insert(2,3);

        liste2.insert(1,1);
        liste2.insert(2,2);

        assertFalse(liste1.equal(liste2));

        liste2.insert(2,3);

        assertTrue(liste1.equal(liste2));
    }

    @Test
    public void laenge() throws Exception {
        ADTListe liste1 = ADTListe.create();

        assertTrue(liste1.laenge().equals(0));

        liste1.insert(1,1);

        assertTrue(liste1.laenge().equals(1));

        liste1.insert(2,2);

        assertTrue(liste1.laenge().equals(2));

        liste1.delete(1);

        assertTrue(liste1.laenge().equals(1));

        liste1.delete(1);

        assertTrue(liste1.laenge().equals(0));

    }

    @Test
    public void insert() throws Exception {
        ADTListe liste1 = ADTListe.create();

        assertTrue(liste1.laenge() == 0);

        liste1.insert(1,1);

        assertTrue(liste1.laenge() == 1);
        assertTrue(liste1.find(1).equals(1));

        liste1.insert(2,2);

        assertTrue(liste1.laenge() == 2);
        assertTrue(liste1.find(2).equals(2));

        liste1.insert(2,3);

        assertTrue(liste1.laenge() == 3);
        assertTrue(liste1.find(2).equals(3));
        assertTrue(liste1.find(3).equals(2));

        liste1.insert(7,4);

        assertTrue(liste1.laenge().equals(4));
        assertTrue(liste1.find(4).equals(4));
    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void find() throws Exception {
        ADTListe liste1 = ADTListe.create();

        assertTrue(liste1.find(1).equals(0));

        liste1.insert(2,2);

        assertTrue(liste1.find(1).equals(0));
        assertTrue(liste1.find(2).equals(1));


    }

    @Test
    public void retrieve() throws Exception {
        ADTListe liste1 = ADTListe.create();
        liste1.insert(1,1);
        liste1.insert(2,2);

        assertTrue(liste1.retrieve(1).equals(1));

        assertTrue(liste1.retrieve(1).equals(2));

        assertNull(liste1.retrieve(1));

        assertTrue(liste1.isEmpty());
    }

    @Test
    public void concat() throws Exception {
        ADTListe liste1 = ADTListe.create();
        ADTListe liste2 = ADTListe.create();
        ADTListe liste3 = ADTListe.create();

        liste1.insert(1,1);
        liste1.insert(2,2);

        liste2.insert(1,3);
        liste2.insert(2,4);

        liste3.insert(1,1);
        liste3.insert(2,2);
        liste3.insert(3,3);
        liste3.insert(4,4);

        liste1.concat(liste2);
        assertTrue(liste1.equal(liste3));



    }
}