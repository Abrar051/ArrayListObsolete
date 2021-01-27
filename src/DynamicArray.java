import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {
    String[] data;
    int size;
    public DynamicArray ()
    {
        size=0;
        data = new String[1];
    }
    public int getSize (){

        return data.length;
    }
    public String get (int index)
    {
        return (String) data[index];
    }
    public void add (String obj)
    {
        ensureCapacity (size+1);
        data[size++]=obj;
    }
    public boolean add (int index , String obj)
    {
        data[index]=obj;
        return false;
    }
    public void put (int index , String obj)
    {
        int length=0;
        String temp;
        while (true)
        {
            if (data[length]==null)
            {
                break;
            }
            else
            {
                length++;
            }
        }
        //length++;
        //data[index-1]=obj;
        //System.out.println("Your length is "+length);
        for (int i=length+1;i>index;i--)
        {
            data[i]=data[i-1];
            data[i-1]=null;
        }
        data[index-1]=obj;
    }
    public void printString (DynamicArray str , int length )
    {
        for (int i=0;i< str.data.length;i++)
        {
            if (str.get(i)==null)
            {
                System.out.print("");
                break;
            }
            else
                System.out.print(" " + str.get(i));
        }
    }
    private void ensureCapacity(int minimumCapacity) {
        int oldSize = getSize();
        if (minimumCapacity>oldSize)
        {
            int newCapacity = oldSize+5;
            data = Arrays.copyOf(data,newCapacity);
        }
    }
}
