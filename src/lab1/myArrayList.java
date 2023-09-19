package lab1;

public class myArrayList {
	private static final int INITIAL_CAPACITY = 50;
	private static final double GROWTH_RATE= 0.2;
	private Fraction[] list = null;
	private int capacity = INITIAL_CAPACITY;
	private int size = 0;
	
	
	
	public myArrayList() {
		list = new Fraction[size];
    }

	public myArrayList(int n) {
		list = new Fraction[n];
	}
	
	 public static void main(String[] args) {
		 myArrayList myList = new myArrayList();

	     // Test the add method
	     myList.add(new Fraction(1, 2));
	     myList.add(new Fraction(3, 4));
	     // ...

	     // Test the remove method
	     Fraction removedFraction = myList.remove(new Fraction(1, 2));
	     if (removedFraction != null) {
	         System.out.println("Removed Fraction: " + removedFraction);
	     } else {
	         System.out.println("Fraction not found.");
	     }

	     // Test the contains method
	     boolean containsFraction = myList.contains(new Fraction(3, 4));
	     System.out.println("Contains Fraction (3/4): " + containsFraction);
	 }

	
	  public boolean add(Fraction input) {
	        
		  /** this can be done with my reconfigure method
		  if (list.length() >= capacity) {
            // If the list is full, calculate the new capacity based on the growth policy
            int newCapacity = (int) (capacity + capacity * growthPolicy);
            list.ensureCapacity(newCapacity);
            capacity = newCapacity;
        }
        **/
		 
		if(size >= capacity)
			reconfigure();
		
        
       // return list.add(input);
		return false;
    }

	
	public Fraction remove(Fraction input) {
		Fraction itemToRemove = input;
		      // Check if the item to remove exists in the array
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].hasSameValue(input)) {
                found = true;
                break;
            }
        }
        if (!found) {
            return null;
        }
        // Create a new array to hold the result with one less element
        Fraction[] result = new Fraction[list.length - 1];
        int resultIndex = 0;
        // Copy elements from the original array to the result array, excluding the item to remove
        for (int i = 0; i < list.length; i++) {
            if (list[i] != itemToRemove) {
                result[resultIndex] = list[i];
                resultIndex++;
            }
        }
        return input;
    }
		
	
	
	public boolean contains(Fraction input) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].hasSameValue(input)) {
                return true; // Found a matching fraction
            }
        }
        return false; // Fraction not found in the list
    }
	
	public int Size() {
		return size;
		
	}
	
	
	/**Ethan Gilles
	 * whenever the array is full, call reconfigure. This will copy the current array into a bigger one
	 * and set the internal array to it
	 */
	public void reconfigure() {
		
		//changes the capacity of the array
		capacity += capacity*GROWTH_RATE;
		
		
		//new fraction array of correct size
		Fraction[] bigArray = new Fraction[capacity];
		
		//set values equal
		for(int i = 0; i < size; i++) {
			bigArray[i] = list[i];
		}
		
		//array that is instanced with the arrayList is turned into the big array.
		list = bigArray;
	}
	
}


