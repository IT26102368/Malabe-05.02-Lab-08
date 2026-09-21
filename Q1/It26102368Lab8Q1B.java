import java.util.Scanner;

  public class It26102368Lab8Q1B{
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);

   int[]myArray=new int[5];
   int[]evenArray=new int[5];
    
   System.out.println("Enter 5 numbers :");

    for (int i=0; i<myArray.length; i++){
        System.out.print("Enter number"+ (i+1) + ":");
        myArray[i]=sc.nextInt();
    }
        
      int count=0;
        for(int i=0; i<myArray.length; i++){
            if (myArray[i]%2==0){
                evenArray[count]=myArray[i];
                count++;
  
            }        
        }
        
    System.out.println("\nmyArray Contents:");
    for (int i=0; i<myArray.length; i++){
        System.out.print (myArray[i]+" ");
    }  

        System.out.println("\nevenArray Contents:");
        for (int i=0; i<evenArray.length; i++){
            System.out.print(evenArray[i]+" ");
        }
        System.out.println();
    }  
  }
    
  