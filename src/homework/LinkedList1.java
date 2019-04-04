package homework;

public class LinkedList1
{
    public class Node
    {
        public String value;
        public Node next;
        
        Node(String val, Node n)
        {
            value = val;
            next = n;
        }
        
        Node(String val)
        {
           // Call the other (sister) constructor.
           this(val, null);            
        }
    }	
	 
    public Node first;
    public Node last;

    private Node sorted;
    
    public LinkedList1()
    {
        first = null;
        last = null;
        sorted = null;
    }

    public Node sort(){
        Node current = first;
        while (current != null)
        {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        first = sorted;
        while(sorted.next != null){
            sorted = sorted.next;
        }
        last = sorted;
        return first;
    }

    void sortedInsert(Node newNode)
    {
        if (sorted == null || (sorted.value.compareTo(newNode.value) > 0))
        {
            newNode.next = sorted;
            sorted = newNode;
        }
        else
        {
            Node current = sorted;
            while (current.next != null && current.next.value.compareTo(newNode.value) < 0)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public Node reverse(){
        Node reversed = null;
        Node tmpToInsert = first;

        while(first != null) {
            tmpToInsert = first;
            while (tmpToInsert.next != null) {
                tmpToInsert = tmpToInsert.next;
            }
            if (reversed == null) {
                reversed = tmpToInsert;
            } else {
                Node tmp = reversed;
                while(tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = tmpToInsert;
            }
            remove(size() - 1);
        }
        first = reversed;
        last = tmpToInsert;
        return reversed;
    }
    
    public boolean isEmpty()
    {        
        return first == null;       
    }
    
    public int size()
    {
       int count = 0;
       Node p = first;     
       while (p != null)
       {
           count ++;
           p = p.next;
       }
       return count;
    }
    
    public void add(String e)
    {
      if (isEmpty()) 
      {
          first = new Node(e);
          last = first;
      }
      else
      {
          last.next = new Node(e);
          last = last.next;
      }      
    }
    
    public void add(int index, String e)
    {
         if (index < 0  || index > size()) 
         {
             String message = String.valueOf(index);
             throw new IndexOutOfBoundsException(message);
         }
         
         // Index is at least 0
         if (index == 0)
         {
             // New element goes at beginning
             first = new Node(e, first);
             if (last == null)
                 last = first;
             return;
         }
         
         // Set a reference pred to point to the Node that
         // will be the predecessor of the new Node
         Node pred = first;        
         for (int k = 1; k <= index - 1; k++)        
         {
            pred = pred.next;           
         }
         
         // Splice in a Node containing the new element
         pred.next = new Node(e, pred.next);  
         
         // Is there a new last element ?
         if (pred.next.next == null)
             last = pred.next;         
    }
    
    public String toString()
    {
      StringBuilder strBuilder = new StringBuilder();
      
      // Use p to walk down the linked list
      Node p = first;
      while (p != null)
      {
         strBuilder.append(p.value + "\n"); 
         p = p.next;
      }      
      return strBuilder.toString(); 
    }
    
    public String remove(int index)
    {
       if (index < 0 || index >= size())
       {  
           String message = String.valueOf(index);
           throw new IndexOutOfBoundsException(message);
       }
       
       String element;  // The element to return     
       if (index == 0)
       {
          // Removal of first item in the list
          element = first.value;    
          first = first.next;
          if (first == null)
              last = null;             
       }
       else
       {
          // To remove an element other than the first,
          // find the predecessor of the element to
          // be removed.
          Node pred = first;
          
          // Move pred forward index - 1 times
          for (int k = 1; k <= index -1; k++)
              pred = pred.next;
          
          // Store the value to return
          element = pred.next.value;
          
          // Route link around the Node to be removed
          pred.next = pred.next.next;  
          
          // Check if pred is now last
          if (pred.next == null)
              last = pred;              
       }
       return element;        
    }
    
    public boolean remove(String element)
    {
       if (isEmpty()) 
           return false;      
      
       if (element.equals(first.value))
       {
          first = first.next;
          if (first == null)
              last = null;       
          return true;
       }
      
      Node pred = first;
      while (pred.next != null && 
             !pred.next.value.equals(element))
      {
          pred = pred.next;
      }

      if (pred.next == null)
          return false;
      
      pred.next = pred.next.next;
      
      if (pred.next == null)
          last = pred;
      
      return true;       
    }
    
    public static void main(String [] args)
    {
        LinkedList1 ll = new LinkedList1();
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        System.out.println("The members of the list are:");
        System.out.print(ll);
    }
}