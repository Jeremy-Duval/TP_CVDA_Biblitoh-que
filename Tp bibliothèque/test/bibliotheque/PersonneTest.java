package bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Amélie Cordier
 */
public class PersonneTest {

    public PersonneTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Personne.
     */
    @Test
    public void testGetNumero() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne alan2 = new Personne("Turing", "Alan", 1912);
        assertEquals(alan2.getNumero(), alan.getNumero()+1);//on ne connait pas l'ordre des tests, seul moyen
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test of getDernierNum method, of class Personne.
     */
    @Test
    public void testGetDernierNum() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(alan.getDernierNumero(), alan.getNumero());
    }
    /**
     * Test of setNumero method, of class Personne.
     */
    @Test
    public void testSetNumero() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne alan2 = new Personne("Turing", "Alan", 1912);
        assertEquals(alan.getNumero()+1, alan2.getNumero());//on ne connait pas l'ordre des tests, seul moyen
    }

    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setNomPers("Minsky");
        assertEquals("Minsky", alan.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class Personne.
     */
    @Test
    public void testSetPrenomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setPrenomPers("Marvin");
        assertEquals("Marvin", alan.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setAnNaissance(1990);
        assertEquals(1990, alan.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing, Alan, 1912", alan.toString());
    }

}
