/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import subbusinesstier.Fabryka;
import subbusinesstier.entities.Miejsce;
import subbusinesstier.entities.Seans;

/**
 *
 * @author Arbuz
 */
public class FabrykaTest {
    
    public FabrykaTest() {
    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    DaneTestowe dane;
    Fabryka f;
    @Before
    public void setUp() {
        dane = new DaneTestowe();
        f = new Fabryka();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testStworzSeans() {
        System.out.println("Testowanie tworzenia seansów");
        for(int i = 0; i < dane.liczbaSeansow; i++){
            Seans seans = f.stworzSeans(dane.daneSeansow[i]);
            assertEquals(seans, dane.seanse[i]);
        }
        assertNotEquals(f.stworzSeans(dane.daneSeansow[0]), f.stworzSeans(dane.daneSeansow[1]));
    }
    
    @Test
    public void testStworzMiejsce(){
        System.out.println("Testowanie tworzenia miejsc");
        for(int i = 0; i < dane.liczbaSeansow; i++){
            for(int j = 0; j < 4; j++){
                Miejsce miejsce = f.stworzMiejsce(dane.miejscaStr[i][j]);
                assertEquals(miejsce, dane.miejsca[i][j]);
            }
        }
    }
}
