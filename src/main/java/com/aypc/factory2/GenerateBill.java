package com.aypc.factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String args[])throws IOException{  
        GetPlanFactory planFactory = new GetPlanFactory();  
          
        System.out.print("Enter the name of plan for which the bill will be generated, Plan:(" +planFactory.getEntirePlanType() +"): ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    
        String planName=br.readLine();
        PlanType planType = PlanType.valueOf(planName.toUpperCase());
        System.out.print("Enter the number of units for bill will be calculated: ");  
        int units=Integer.parseInt(br.readLine());  

        Plan p = planFactory.getPlan(planType);
        //call getRate() method and calculateBill()method of DomesticPaln.

         System.out.print(String.format("Bill amount for %s of %s units is: ",planType,units));
             p.getRate();  
             p.calculateBill(units);  
     }  
      
}
