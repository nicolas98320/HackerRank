public Difference(int[] array) {
    elements = array;
}

public void computeDifference() {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < elements.length; i++) {
        if (elements[i] > max) {
            max = elements[i];
        }
        if (elements[i] < min) {
            min = elements[i];
        }
    }
        
    maximumDifference = max - min;
}