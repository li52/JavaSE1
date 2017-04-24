package java2017.basic;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class ArrayVector { // 使用数组来模拟一个向量 DynamicArray

    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int size;
    private int capacity;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;

    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }

    public void add(String string) {
        if (size == capacity) {
            String[] newString = new String[capacity * 2];
            capacity *= 2;
            System.arraycopy(string, 0, newString, 0, strings.length);
            strings = newString;
        }
        strings[size] = string;
        size++;
    }

    public String get(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }
    public int size() {
        return size;
    }
    public int capacity() {
        return capacity;
    }

    public static void main(String[] args) {
        // void add(String element)
        // String remove(int index)
        // String set(int index, String element)
        // String get(int index)
        // int size()
        // int capacity()

        ArrayVector arrayVector = new ArrayVector(2);
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.size());
        System.out.println(arrayVector.capacity());
        //System.out.println(arrayVector.get(0)); // hello
        //System.out.println(arrayVector.get(1)); // hi
    }
}