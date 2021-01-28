///Dynamic array

import java.util.Scanner;
public class CallArray {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        DynamicArray str = new DynamicArray();
        int length=0;
        // int length=0;
        while (true)
        {
            System.out.println("Enter 1 for input 2 for break : ");
            int i = input.nextInt();
            if (i==1){
                String arr = input.next();
                str.add(arr);
                length++;
            }
            else if (i==2)
            {
                break;
            }
        }
        System.out.println("Your array size is : "+length);
        System.out.print(" [ ");
        str.printString(str, length);
        //str.add(2,"bmhh");
        str.put(3,"hyhyh");
        System.out.print(" ] ");
        System.out.println();
        str.printString(str,length+1);
        System.out.println();
        System.out.println("String size is +"+str.getSize());
    }
}
