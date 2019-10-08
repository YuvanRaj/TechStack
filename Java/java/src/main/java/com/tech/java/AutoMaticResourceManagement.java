package com.tech.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class AutoMaticResourceManagement {

	public void readData() throws Exception
    { 
        BufferedReader br = null; 
        String str = " ";           
        System.out.println("Enter the file path"); 
        br = new BufferedReader(new InputStreamReader(System.in));                   
        str = br.readLine();
        str.replace(" ","");
        br.close();
        
        //If exception occured at str.replace(" ","") line, resource will not be closed.
        //If the same request comes N times, then we will end up with Out of Memeory Error.
    }
}


class ResourceAutocloseable{
	public void readData() throws Exception
    {
        try (BufferedReader br = new BufferedReader(new FileReader("path")))
        {
            String str = br.readLine();
            str.replace(" ","");
        }
        
        //Even if exception occured at str.replace(" ","") line, resource will not be closed.
    }
}