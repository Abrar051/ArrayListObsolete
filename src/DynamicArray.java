import java.util.Arrays;

public class DynamicArray {
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
    public String get (int index)
    {
        return (String) data[index];
    }
    public void add (Object obj)
    {
        ensureCapacity (size+1);
        data[size++]=obj;
    }
    public boolean add (int index , Object obj)
    {
        data[index]=obj;
        return false;
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
