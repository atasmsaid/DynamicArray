package dynamicarray;

public class DynamicArray {

    private int[] array = null;
    private int capacity = 5;
    private int size = 0;
    private int index = 0;

    public DynamicArray() {
        array = new int[capacity];
    }

    public void add(int data) {

        if (size == capacity) {
            array_expand();
        }

        array[size] = data;
        size++;
    }

    public void add(int data, int index) {

        if (size == capacity) {
            array_expand();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        size++;
    }

    public void array_expand() {
        //dizinin boyutunu iki katına çıkarır
        int[] newArray = new int[capacity * 2];

        //array dizisindeki elemanları newArray e atar
        for (int i = 0; i < capacity; i++) {
            newArray[i] = array[i];
        }

        array = newArray;

        this.capacity = capacity * 2;
    }

    public void delete() {
        size--;
        this.array[size]=0;
    }

    public void delete(int data) {
        for (int i = data; i < size-1; i++) {
            array[i]=array[i+1];
        }
        size--;        
    }

    public void delete_index(int index) {
        for (int i = index; i < size-1; i++) {
            array[i]=array[i+1];
        }
        size--;        
    }

    public int capacity() {
        return this.capacity;
    }

    public void clear() {
        this.capacity=5;
        this.size=0;
        this.index=0;
        this.array = new int[capacity];
    }

    public int length() {
        return this.size;
    }

    public int get(int index) {
        return array[index];
    }
}
