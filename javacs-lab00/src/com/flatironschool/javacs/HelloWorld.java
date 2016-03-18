package com.flatironschool.javacs;

public class HelloWorld
{
    public static Double getVersion()
    {
       String print = System.getProperty("java.version").substring(0,3);
       double version = Double.parseDouble(print);
       return version;
    }

    public static void main(String[] args)
    {
	    getVersion();
    }
}
