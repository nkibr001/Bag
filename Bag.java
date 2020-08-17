public interface Bag 
{
    public boolean isEmpty(); // returns true if bag is empty, false otherwise
 
    public void print(); // prints the content of the bag
 
    public void add(String s); // adds string s to the bag

    public void remove(String s); // remove all occurrences of string s

    public int count(String s); // returns number of occurrences of string s in the bag
}
