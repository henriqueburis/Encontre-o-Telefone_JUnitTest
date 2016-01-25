/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import encontre.o.telefone.EncontreOTelefone;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author luiz.buris
 */
public class JUnitTest {

    EncontreOTelefone entel = new EncontreOTelefone();

    @Test
    public void Test() {
        String entrada = "1-HOME-SWEET-HOME";
        String saida = "1-4663-79338-4663";

        Assert.assertEquals(saida, entel.EncontreTelefone(entrada).trim().replaceAll(" ", "-"));
    }

    public JUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando.....");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizando...");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
