package com.traxxsoftware.chemsymbol;


public class ChemSymbol {

    public static boolean isValidSymbol(String element, String symbol)
    {
        // Uppercase element and symbol strings
        String elementUpper = element.toUpperCase();
        String symbolUpper = symbol.toUpperCase();

        // Check symbol length
        if(symbolUpper.length() != 2)
        {
            return false;
        }

        // Get first and second character of upper symbol
        char firstCharUpper = symbolUpper.charAt(0);
        char secondCharUpper = symbolUpper.charAt(1);

        // Get first and second character of lower symbol
        char firstChar = symbol.charAt(0);
        char secondChar = symbol.charAt(1);

        // Check first letter of Symbol is uppercase and second letter is lowercase.
        if(!Character.isUpperCase(firstChar) || !Character.isLowerCase(secondChar))
        {
            return false;
        }

        // Check that first charachter of element is upper and all others are lower
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

        // Check that first letter comes before second letter.
        char charactersUpper[] = elementUpper.toCharArray();

        boolean firstFound = false;
        boolean secondFound = false;

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

        boolean isValid = false;

        if(firstFound && secondFound)
        {
            isValid = true;
        }

        return isValid;
    }

}
