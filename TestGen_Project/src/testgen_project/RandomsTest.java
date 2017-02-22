package testgen_project;

import java.util.Scanner;

/**
 *
 * @author Sorrasak_1995
 */
public class RandomsTest {

   public static void main(String args[]) {
   int c, numDataset, Min, Max,Var1,Var2,Var3,Var4;
   double r;
 
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter number of datasets");
    numDataset = 10; 
  
    
    
    for(c = 0; c < numDataset;c++) {
     System.out.println("Enter minimum input");
     Min = in.nextInt();
     System.out.println("Enter maximum input");
     Max = in.nextInt();
    
       if(Min < 0 && Max < 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(Max - Min))+Min;
            Var1 = (int)r;
            System.out.println("Valid Input:"+Var1);
             
            r = (Math.random()*(Min))+Min;
             Var2 = (int)r;
             System.out.println("Invalid Input1:"+Var2);
             
            r = Math.random()*(Max);
             Var3 = (int)r;
             System.out.println("Invalid Input2:"+Var3);
             
            r = Math.random()*100;
             Var4 = (int)r;
             System.out.println("Invalid Input3:"+Var4);
         }
       else if(Min < 0 && Max > 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(Max - Min))+Min;
            Var1 = (int)r;
            System.out.println("Valid Input:"+Var1);
            
            r = (Math.random()*(Min))+Min;
            Var2 = (int)r;
            System.out.println("Invalid Input:"+Var2);
            
            r = (Math.random()*(Max))+Max;
            Var3 = (int)r;
            System.out.println("Invalid Input:"+Var3);
         }
       else if(Min > 0 && Max > 0)
         for (int i = 0;i < 1; i++)
         {
            r = (Math.random()*(Max - Min))+Min;
            Var1 = (int)r;
            System.out.println("Valid Input:"+Var1);
            
            r = (Math.random()*(Min));
            Var2 = (int)r;
            System.out.println("Invalid Input:"+Var2);
            
            r = (Math.random()*Max)+Max;
            Var3 = (int)r;
            System.out.println("Invalid Input:"+Var3);
            
            r = (Math.random()*(-Max));
            Var4 = (int)r;
            System.out.println("Invalid Input:"+Var4);
         }
    }
    
    
    
    }
}
