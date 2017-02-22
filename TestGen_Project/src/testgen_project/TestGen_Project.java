package testgen_project;

import java.util.Scanner;

/**
 *
 * @author Sorrasak_1995
 */
public class TestGen_Project {

   public static void main(String args[]) {
   int c, numFun, inputMinimum, inputMaximum,rand;
   double r;
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of datasets");
    numFun = in.nextInt(); 
    
    
    
    for(c = 0; c < numFun;c++) {
       System.out.println("Enter minimum input");
       inputMinimum = in.nextInt();
       System.out.println("Enter maximum input");
       inputMaximum = in.nextInt();
    
       if(inputMinimum < 0 && inputMaximum < 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(inputMaximum - inputMinimum))+inputMinimum;
            rand = (int)r;
            System.out.println("Valid Input:"+rand);
             
            r = (Math.random()*(inputMinimum))+inputMinimum;
             rand = (int)r;
             System.out.println("Invalid Input1:"+rand);
             
            r = Math.random()*(inputMaximum);
             rand = (int)r;
             System.out.println("Invalid Input2:"+rand);
             
            r = Math.random()*100;
             rand = (int)r;
             System.out.println("Invalid Input3:"+rand);
         }
       else if(inputMinimum < 0 && inputMaximum > 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(inputMaximum - inputMinimum))+inputMinimum;
            rand = (int)r;
            System.out.println("Valid Input:"+rand);
            
            r = (Math.random()*(inputMinimum))+inputMinimum;
            rand = (int)r;
            System.out.println("Invalid Input:"+rand);
            
            r = (Math.random()*(inputMaximum))+inputMaximum;
            rand = (int)r;
            System.out.println("Invalid Input:"+rand);
         }
       else if(inputMinimum > 0 && inputMaximum > 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(inputMaximum - inputMinimum))+inputMinimum;
            rand = (int)r;
            System.out.println("Valid Input:"+rand);
            
            r = (Math.random()*(inputMinimum));
            rand = (int)r;
            System.out.println("Invalid Input:"+rand);
            
            r = (Math.random()*inputMaximum)+inputMaximum;
            rand = (int)r;
            System.out.println("Invalid Input:"+rand);
            
            r = (Math.random()*(-inputMaximum));
            rand = (int)r;
            System.out.println("Invalid Input:"+rand);
         }
    }
    
    
    
    }
}
