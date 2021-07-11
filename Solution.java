class MedianFinder {

    ArrayList al;      // field var to hold the current sorted arraylist of integers
    public MedianFinder() 
    {
        al = new ArrayList();
    }
    
    public void addNum(int num) 
    {
            al.add(num);
    }
    
    public double findMedian() 
    {
        al.sort(Comparator.naturalOrder()); //By ordering the arraylist when finding median we save time 
		
		// check if even
        if(al.size()%2 == 0)
        {
             return((double)((int)(al.get(al.size()/2 -1))+(int)(al.get(al.size()/2)))/2); // returns the median of an even length arraylist
        }
        else
        {
            return((double)(int)al.get((al.size()/2))); // returns the median of an odd length arraylist
        }
        
    }
}
