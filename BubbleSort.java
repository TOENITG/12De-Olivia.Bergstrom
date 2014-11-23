
package bubblesort;
import java.util.Arrays;

public class BubbleSort {
    static public int[] array;
    
    public static void bubbleSort() {
        int i;
        boolean swapped;
        do {
            swapped = false;
            for(i=0; i < array.length - 1; i++) {
                // Går igenom alla element i arrayen
                if(array[i] > array[i+1]) {
                    // Om elemented i position i är större än det i position i + 1, byt plats    
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
          // Fortsätt så länge det finns något kvar att sortera
    }
    
    public static void fillArray() {
        array = new int[50];
        for (int i=0; i < 50; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
            // Fyller med slumpmässiga tal    
            
        }
    }
    
    public static void printArray() {
        for(int i = 0; i < array.length; i++) {
            System.out.println(Integer.toString(array[i]));
        }
    }
    
    public static void main(String[] args) {
        fillArray();
        System.out.println("Osorterade värden");
        printArray();
        bubbleSort();
        System.out.println("\nSorterade värden");
        printArray();
        
        
        
        
    }
    
}




/*procedure bubbleSort( A : lista av sorterbara objekt ) defined as:
  do
    swapped := false
    for each i in 0 to length( A ) - 2 do:
      if A[ i ] > A[ i + 1 ] then
        swap( A[ i ], A[ i + 1 ] )
        swapped := true
      end if
    end for
  while swapped
end procedure
**/ 

