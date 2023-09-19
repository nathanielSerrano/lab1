package lab1;

public class myArrayList {
	private static final int INITIAL_CAPACITY = 50;
	private static final double GROWTH_RATE= 0.2;
	private Fraction[] list = null;
	private int capacity = INITIAL_CAPACITY;
	private int size = 0;
	
	
	
	public myArrayList() {
		list = new Fraction[capacity];
    }

	public myArrayList(int n) {
		list = new Fraction[n];
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
		
        
        return list.add(input);
    }

	
	public Fraction remove(Fraction input) {
		
		
	}
	
	public boolean contains(Fraction input) {
		
		
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
