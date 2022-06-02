package Kolokviumski;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bus {
    
    public static void main(String[] args) throws Exception {
        int i,j,k;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        br.close();
        
        // Vasiot kod tuka
        int minimum;
        int maximum;
        
        if(M == 0)
        {
        	minimum = N*100;
        	maximum = N*100;
        	System.out.print(minimum+"\n"+maximum);
        }
        
        
        else if(N == 0)
        {
        	System.out.print("Nema prisutni vozrasni!");
        }
        
        else
        {
        	if(N < M)
        	{
        		minimum = N*100 + (M-N)*100;
        		maximum = N*100 + (M-1)*100;
        		System.out.print(minimum+"\n"+maximum);
        	}
        	
        	else 
        	{
        		minimum = N*100;
        		maximum = N*100 + (M-1)*100;
        		System.out.print(minimum+"\n"+maximum);
        	}
        	
        }
    }
    
}