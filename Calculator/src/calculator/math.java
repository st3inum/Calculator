/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.math.BigInteger;
import java.lang.Math;
/**
 *
 * @author swe
 */
public class math {
    StringProcessing comp=new StringProcessing();
    public String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
    public String Square(String s)
    {
        BigInteger number = new BigInteger(s);
        number = number.multiply(number);
        return number.toString();
    }
    public String Sqrt(String s)
    {
        if(s.charAt(0)=='-')return "00001";
        if(comp.NumberSize(s)>=16)return "00002";
        Double a=Double.parseDouble(s);
        a=Math.sqrt(a);
        return a.toString();
    }
    
    
    public double calc(double previous,int ope,String number)
    {
        
        /*
            0 plus
            1 minus
            2 multiplication
            3 division
            4 power
            5 mod
        */
        double current=Double.parseDouble(number);
        if(ope==0)
        {
            previous+=current;
            System.out.println(previous);
        }
        else if(ope==1)previous-=current;
        else if(ope==2)previous*=current;
        else if(ope==3)previous/=current;
        else if(ope==4)previous=Math.pow(previous, current);
        else if(ope==5)
        {
            if(!comp.isAnyDot(number))
            {
                int curr=Integer.parseInt(number);
                int pre=(int) previous;
                return (double)(pre%curr);
            }
        }
//        else System.out.println("paisi na "+ope+" "+current+" "+previous);
        return previous;
    }
        
}

