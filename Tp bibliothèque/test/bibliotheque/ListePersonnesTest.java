/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author p1501022
 */
public class ListePersonnesTest {
    
    public ListePersonnesTest() {
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
     * Test of ajouter method, of class ListePersonnes.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Personne p = null;
        ListePersonnes instance = new ListePersonnes();
        instance.ajouter(p);
    }

    /**
     * Test of appartien method, of class ListePersonnes.
     */
    @Test
    public void testAppartien() {
        System.out.println("appartient");
        Personne p = null;
        ListePersonnes instance = new ListePersonnes();
        boolean expResult = false;
        boolean result = instance.appartien(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_String_String() {
        System.out.println("appartient");
        String nom = "";
        String prenom = "";
        ListePersonnes instance = new ListePersonnes();
        boolean expResult = false;
        boolean result = instance.appartient(nom, prenom);
        assertEquals(expResult, result);
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_int() {
        System.out.println("appartient");
        int num = 0;
        ListePersonnes instance = new ListePersonnes();
        boolean expResult = false;
        boolean result = instance.appartient(num);
        assertEquals(expResult, result);
    }
    
}
