import java.util.Arrays;
import java.util.Scanner;
public class DynamicArray {
    String[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new String[1];
    }

    public int getSize() {

        return data.length;
    }

    public String get(int index) {
        return (String) data[index];
    }

    public void add(String obj) {
        ensureCapacity(size + 1);
        data[size++] = obj;
    }

    public boolean add(int index, String obj) {
        data[index] = obj;
        return false;
    }

    public void put(int index, String obj) {

        String temp;
        int length=lengthCounter();
        if (index <= data.length) {
            for (int i = data.length - 1; i >= index; i--) {
                temp = data[i - 1];
                data[i] = temp;
            }
            data[index - 1] = obj;
        } else {
            //data[length] = obj;

            for (int i= data.length;i<index;i++)
            {
                add(null);
                if (i==(index-1))
                {
                    data[i-1]=obj;
                    break;
                }

            }
        }
    }

    public void printString(DynamicArray str, int length) {
        System.out.print(" [ ");
        for (int i = 0; i < str.data.length; i++) {
            if (str.get(i) == null) {
                System.out.print(" null ");
                //break;
            } else
                System.out.print(" " + str.get(i));
        }
        System.out.print(" ] ");
    }

    private void ensureCapacity(int minimumCapacity) {
        int oldSize = getSize();
        if (minimumCapacity > oldSize) {
            int newCapacity = oldSize + 5;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public int lengthCounter ()
    {
        int length=0;
        while (true) {
            if (data[length] == null) {
                break;
            } else {
                length++;
            }
        }
        return length;
    }
    public void remove(String str) {
        int length = lengthCounter();
        for (int i=0;i<length;i++)
        {
            if (data[i]==str)
            {
                data[i]=null;
                //break;
            }
        }
    }

    public void remove (int index , String str)
    {
        data[index-1]=null;

    }

}
