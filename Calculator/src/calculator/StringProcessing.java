/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author swe
 */
public class StringProcessing {
    public boolean isValidNumber(String s)
    {
        boolean f=false;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))f=true;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='-' && s.charAt(i)!='.' && !Character.isDigit(s.charAt(i)))f=false;
        }
        return f;
    }
    public boolean isValidPositiveInteger(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))return false;
        }
        return true;
    }
    public boolean isValidInteger(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='-' && !Character.isDigit(s.charAt(i)))return false;
        }
        return true;
    }
    public int NumberSize(String s)
    {
        int c=0;
        if(s.charAt(0)=='-')c--;
        for(int i=0;i<s.length() && s.charAt(i)!='.';i++)c++;
        return c;
    }
    public boolean isAnyDot(String s)
    {
        for(int i=0;i<s.length();i++)if(s.charAt(i)=='.')return true;
        return false;
    }
}
