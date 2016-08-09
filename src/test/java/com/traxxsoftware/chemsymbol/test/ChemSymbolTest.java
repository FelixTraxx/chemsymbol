package com.traxxsoftware.chemsymbol.test;

import com.traxxsoftware.chemsymbol.ChemSymbol;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by macbookpro on 8/8/16.
 */
public class ChemSymbolTest
{

    @Test
    public void testValidSymbol()
    {
        boolean result = ChemSymbol.isValidSymbol("Mercury","Cy");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Boron", "B");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Mercury","Hg");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Mercury","Cy");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Silver","Vr");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Silver","Rv");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Magnesium","Ma");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Magnesium","Am");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Xenon","Nn");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Xenon","Xx");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Xenon","Oo");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Xenon","nn");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Xenon","NN");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("xenon","Nn");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Spenglerium","Ee");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Zeddemorium","Zr");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Venkmine","Kn");
        Assert.assertTrue(result);

        result = ChemSymbol.isValidSymbol("Stantzon","Zt");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Melintzum","Nn");
        Assert.assertFalse(result);

        result = ChemSymbol.isValidSymbol("Tullium","Ty");
        Assert.assertFalse(result);

    }
}
