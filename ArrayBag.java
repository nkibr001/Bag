public class ArrayBag implements Bag
{
    public String bag[];
    public int SIZE=1;
    public int length=0;
    
    public ArrayBag()
    {
        bag= new String[SIZE];
        //initializes a bag of size 10
    }

    public boolean isEmpty() 
    {        
        for(int i=0;i<length;i++)
          {
                if(bag[i]!=null)
                {
                    return false;
                    //the moment an item is found, it returns false
                }
          }        
            return true;
            //if no item is found, returns true
    }

    public void print() 
    {        
        for(int i=0;i<SIZE;i++)
        {
            System.out.println(bag[i]);
            //prints out entire bag
        }
    }

    public void add(String s) 
    {
     int ctr=1;
     if(isEmpty())
     {
         bag[0]=s;
         length++;
         // if it's empty, fills up first space
     }
     else
     {
         for(int i=0;i<SIZE;i++)
         {
          if (bag[i]==null)
          {
              bag[i]=s;
              length++;
              break;
              //fills up the first empty space that is available.
          }
          ctr++;
         }
         
         if(ctr>length)
         {
            String[] tempbag=new String [2*length];            
            System.arraycopy(bag,0,tempbag,0,length);
            
            bag=tempbag;
            bag[ctr-1]=s;
            length++;
            SIZE=SIZE*2;
            //doubles the size of the bag and copies items
         }
     }
    }

    public void remove(String s) 
    {
        for(int i=0;i<SIZE;i++)
        {
            if(s.equals(bag[i]))
            {
                bag[i]=null;
                length--;
            }
        }
        //removes all occurences of desired string
    }

    public int count(String s) 
    {
        int ctr=0;
        for (int i=0;i<SIZE;i++)
        {
            if(s.equals(bag[i]))
            {
             ctr++;   
            }
        }
        //counts all occurences of desired string
        return ctr; 
    } 
}
