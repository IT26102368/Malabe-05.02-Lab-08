import java.util.Scanner;

public class IT26102368Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] studentsArray = new int[8];
        int count = 0;

        
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int studentsID = sc.nextInt();

            if (studentsID<= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] =studentsID;
                count++;
            }
   
       
        boolean isFound = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == studentsID) {
                isFound = true;
                break;
            }
        }

        
        System.out.println();
        if (isFound) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

    }
 }
}
             