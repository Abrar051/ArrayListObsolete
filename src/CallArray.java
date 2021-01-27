///Dynamic array

import java.util.Scanner;
public class CallArray {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        DynamicArray str = new DynamicArray();
        while (true)
        {
            System.out.println("Enter 1 for input 2 for break : ");
            int i = input.nextInt();
            if (i==1){
                String arr = input.next();
                str.add(arr);
            }
            else if (i==2)
            {
                break;
            }
        }
        System.out.println("Your array size is : "+(str.data.length));
        System.out.print(" [ ");
        for (int i=0;i< str.data.length;i++)
        {
            if (str.get(i)==null)
            {
                System.out.print("");
                break;
            }
            else{
                System.out.print(" "+str.get(i));
            }
        }
        str.add(2,"bmhh");
        System.out.print(" ] ");
        System.out.println();
        for (int i=0;i< str.data.length-1;i++)
        {
            System.out.print(" "+str.get(i));
        }
    }
}
