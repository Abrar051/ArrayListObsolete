import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class DynamicArray <Type>{
    Object[] data;
    int size;
    public DynamicArray ()
    {
        size=0;
        data = new Object[1];
    }
    public int getSize (){
        return data.length;
    }
    public Type get (int index)
    {
        return (Type) data[index];
    }
    public void add (Object obj)
    {
        ensureCapacity (size+1);
        data[size++]=obj;
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
