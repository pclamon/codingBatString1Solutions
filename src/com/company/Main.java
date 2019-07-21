package com.company;

public class Main {

    public static void main(String[] args)
    {

    }

    public String helloName(String name)
    {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b)
    {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word)
    {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word)
    {
        String i = out.substring(0,2);
        String j = out.substring(2,4);

        return i + word + j;
    }

    public String extraEnd(String str)
    {
        int j = str.length();
        int i = str.length() - 2;

        String extra = str.substring(i, j);

        return extra + extra + extra;
    }

    public String firstTwo(String str)
    {
        if (str.length() > 1)
        {
            String i = str.substring(0,2);
            return i;
        }
        else
        {
            return str;
        }
    }

    public String firstHalf(String str)
    {
        return str.substring(0, str.length()/2);
    }

    public String withoutEnd(String str)
    {
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b)
    {
        if (a.length() > b.length())
        {
            return b + a + b;
        }
        else if (b.length() > a.length())
        {
            return a + b + a;
        }
        return a + a + a;
    }

    public String nonStart(String a, String b)
    {
        String firstPart = a.substring(1);
        String secondPart = b.substring(1);

        return firstPart + secondPart;
    }

    public String left2(String str)
    {
        String firstPart = str.substring(0, 2);
        String secondPart = str.substring(2);

        return secondPart + firstPart;
    }

    public String right2(String str)
    {
        String firstPart = str.substring(str.length()-2);
        String secondPart = str.substring(0, str.length()-2);

        return firstPart + secondPart;
    }

    public String theEnd(String str, boolean front)
    {
        String theEnd;

        if (!front)
        {
            theEnd = str.substring(str.length()-1, str.length());
        }
        else
        {
            theEnd = str.substring(0,1);
        }

        return theEnd;
    }

    public String withouEnd2(String str)
    {
        String withoutEnd;

        if (str.length() > 2)
        {
            withoutEnd = str.substring(1, str.length()-1);
        }
        else
        {
            withoutEnd = "";
        }

        return withoutEnd;
    }

    public String middleTwo(String str)
    {
        String middleTwo = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);

        return middleTwo;
    }

    public boolean endsLy(String str)
    {
        boolean endsLy = false;

        if (str.length() > 1 && str.substring(str.length() - 2).equals("ly"))
        {
            endsLy = true;
        }

        return endsLy;
    }

    public String nTwice(String str, int n)
    {
        String firstPart = str.substring(0, n);
        String secondPart = str.substring(str.length() - n);
        String nTwice = firstPart + secondPart;

        return nTwice;
    }

    public String twoChar(String str, int index)
    {
        String twoChar = "";

        if (str.length() >= index + 2 && index >= 0)
        {
            twoChar = str.substring(index, index + 2);
        }
        else
        {
            twoChar = str.substring(0, 2);
        }

        return twoChar;
    }

    public String middleThree(String str)
    {
        int middleThree = str.length() - 3;
        int ends = (middleThree) / 2;
        String middleThreeStr = str.substring(ends, str.length() - ends);

        return middleThreeStr;
    }

    public boolean hasBad(String str)
    {
        boolean hasBad = false;

        if (str.length() >= 3)
        {
            if (str.substring(0, 3).equals("bad"))
            {
                hasBad = true;
            }
        }

        if (str.length() >= 4)
        {
            if (str.substring(1, 4).equals("bad"))
            {
                hasBad = true;
            }
        }

        return hasBad;
    }

    public String atFirst(String str)
    {
        String atFirst = "";

        if (str.length() == 0)
        {
            atFirst = "@@";
        }
        else if (str.length() == 1)
        {
            atFirst = str.charAt(0) + "@";
        }
        else
        {
            atFirst = str.substring(0, 2);
        }


        return atFirst;
    }

    public String lastChars(String a, String b)
    {
        String firstPart = "";
        String secondPart = "";

        if (a.length() == 0)
        {
            firstPart = "@";
        }
        else
        {
            firstPart = a.substring(0, 1);
        }

        if (b.length() == 0)
        {
            secondPart = "@";
        }
        else
        {
            secondPart = b.substring(b.length() - 1);
        }

        String lastChars = firstPart + secondPart;

        return lastChars;
    }

    public String conCat(String a, String b)
    {
        String conCat;

        if (a.length() > 0 && b.length() > 0)
        {
            if (a.substring(a.length() - 1).equals(b.substring(0, 1)))
            {
                a = a.substring(0, a.length() - 1);
            }
        }

        conCat = a + b;

        return conCat;
    }

    public String lastTwo(String str)
    {
        String lastTwo = str;

        if (str.length() > 1)
        {
            String lastLetter = str.substring(str.length() - 1);
            String secondToLast = str.substring(str.length() - 2, str.length() - 1);
            String theRest = str.substring(0, str.length() - 2);
            lastTwo = theRest + lastLetter + secondToLast;
        }

        return lastTwo;
    }

    public String seeColor(String str)
    {
        String seeColor = "";

        if (str.length() > 3)
        {
            if (str.substring(0, 4).equals("blue"))
            {
                seeColor = "blue";
            }
        }

        if (str.length() > 2)
        {
            if (str.substring(0, 3).equals("red"))
            {
                seeColor = "red";
            }
        }

        return seeColor;
    }

    public boolean frontAgain(String str)
    {
        boolean frontAgain = false;

        if (str.length() > 1)
        {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            {
                frontAgain = true;
            }
        }

        return frontAgain;
    }

    public String minCat(String a, String b)
    {
        if (b.length() > a.length())
        {
            b = b.substring(b.length() - a.length());
        }

        if (a.length() > b.length())
        {
            a = a.substring(a.length() - b.length());
        }

        String minCat = a + b;

        return minCat;
    }

    public String extraFront(String str)
    {
        String extraFont = "";

        if (str.length() > 1)
        {
            String firstTwo = str.substring(0, 2);
            extraFont = firstTwo + firstTwo + firstTwo;
        }
        else
        {
            extraFont = str + str + str;
        }

        return extraFont;
    }

    public String without2(String str)
    {
        String without2 = str;

        if (str.length() > 1)
        {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            {
                without2 = str.substring(2);
            }
        }

        return without2;
    }

    public String deFront(String str)
    {
        String deFront = str.substring(2);
        String firstPart = str.substring(0, 1);
        String secondPart = str.substring(1, 2);

        if ((str.substring(0, 1).equals("a")) && (str.substring(1, 2).equals("b")))
        {
            deFront = firstPart + secondPart + deFront;
        }
        else if (str.substring(0, 1).equals("a"))
        {
            deFront = firstPart + deFront;
        }
        else if (str.substring(1, 2).equals("b"))
        {
            deFront = secondPart + deFront;
        }

        return deFront;
    }

    public String startWord(String str, String word)
    {
        String startWord = "";

        if (str.length() == 0)
        {
            return "";
        }
        if (word.length() > str.length())
        {
            return "";
        }

        if (word.length() == 1)
        {
            startWord = str.substring(0 , 1);
        }
        else if (str.substring(1, word.length()).equals(word.substring(1, word.length())))
        {
            startWord = str.substring(0, word.length());
        }
        else
        {
            startWord = "";
        }

        return startWord;
    }

    public String withoutX(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }

        if (str.length() == 1)
        {
            if (str.charAt(0) == 'x')
            {
                return "";
            }
            else
            {
                return str;
            }
        }

        if (str.charAt(0) == 'x')
        {
            str = str.substring(1, str.length());
        }

        if (str.charAt(str.length() - 1) == 'x')
        {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public String withoutX2(String str)
    {
        String withoutX2 = "";

        for (int i = 0; i < str.length(); i ++)
        {
            if (i == 0 && str.charAt(i) != 'x')
            {
                withoutX2 += str.charAt(i);
            }
            else if (i == 1 && str.charAt(i) != 'x')
            {
                withoutX2 += str.charAt(i);
            }
            else if (i > 1)
            {
                withoutX2 += str.charAt(i);
            }
        }

        return withoutX2;
    }


}
