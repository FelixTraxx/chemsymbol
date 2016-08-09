package com.traxxsoftware.chemsymbol;

/**
 * Created by macbookpro on 8/8/16.
 */
public class ChemSymbol {

    public static void main(String[] args)
    {



    }

    public static boolean isValidSymbol(String element, String symbol)
    {
        boolean isValid = false;
        String elementUpper = element.toUpperCase();
        String symbolUpper = symbol.toUpperCase();

        // Check symbol length
        if(symbolUpper.length() != 2)
        {
            return false;
        }

        char firstCharUpper = symbolUpper.charAt(0);
        char secondCharUpper = symbolUpper.charAt(1);

        char firstChar = symbol.charAt(0);
        char secondChar = symbol.charAt(1);

        // Check first letter of Symbol is uppercase and second letter is lowercase.
        if(!Character.isUpperCase(firstChar) || !Character.isLowerCase(secondChar))
        {
            return false;
        }

        boolean firstFound = false;
        boolean secondFound = false;

        char charactersUpper[] = elementUpper.toCharArray();

        // Check that first letter comes before second letter.
        for(char ch: charactersUpper)
        {
            if(ch == secondCharUpper && firstFound == true)
            {
                secondFound = true;
            }

            if(ch == firstCharUpper && firstFound == false)
            {
                firstFound = true;
            }

        }

        char characters[] = element.toCharArray();

        int index = 0;

        for(char ch: characters)
        {
            if(index == 0 && Character.isLowerCase(ch))
            {
                return false;
            }

            if(index > 0 && Character.isUpperCase(ch))
            {
                return false;
            }

            index++;
        }

        if(firstFound && secondFound)
        {
            isValid = true;
        }

        return isValid;
    }

}
