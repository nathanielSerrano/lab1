package lab1;

public class myArrayList {
	private static final int INITIAL_CAPACITY = 50;
	private static final double GROWTH_RATE= 0.2;
	private Fraction[] list = null;
	private int size = INITIAL_CAPACITY;
	
	
	
	public myArrayList() {
		list = new Fraction[size];
    }

	public myArrayList(int n) {
		list = new Fraction[n];
	}
	
	
	  public boolean add(Fraction input) {
        if (list.size() >= capacity) {
            //Calculate new growth rate is the list is full
            int newCapacity = (int) (capacity + capacity * growthPolicy);
            list.ensureCapacity(newCapacity);
            capacity = newCapacity;
        }
        
        return list.add(input);
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
            return new Fraction(-1,1);
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
	
	
	
}
