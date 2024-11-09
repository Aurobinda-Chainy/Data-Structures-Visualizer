public class ArrayVisualizer {
    private int[] array;
    private int size;

    public ArrayVisualizer(int capacity){
        array = new int[capacity];
        size =0;
    }

    public void add(int value){
        if(size < array.length){
            array[size] = value;
            size++;
        } else{
            System.out.println("Array is full");
        }
    }
   public void display(){
        for(int i = 0; i<size; i++){
            System.out.println(array[i]+ " ");
        }
        System.out.println();
   }

   public static void main(String[] args) {
    ArrayVisualizer arrayVis = new ArrayVisualizer(5);
    arrayVis.add(10);
    arrayVis.add(20);
    arrayVis.display();
   }
}