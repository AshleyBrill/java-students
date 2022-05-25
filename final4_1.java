import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

class Link
   {
   public int studentID;              
   public double studentGrade;           
   public Link next;              
   public Link(int id, double grade) 
      {
      studentID = id;
      studentGrade = grade;
      }
   public void displayLink()      
      {
      System.out.print("{" + studentID + ", " + studentGrade + "} ");
      }
   }  
class LinkList
   {
   private Link first;            

   public LinkList()              
      {
      first = null;               
      }
   public void insertFirst(int id, double grade)
      {                           
      Link newLink = new Link(id, grade);
      newLink.next = first;       
      first = newLink;            
      }
     
     
     
   public Link find(int key)      
      {                           
      Link current = first;              
      while(current.studentID != key)        
         {
         if(current.next == null)        
            return null;                 
         else                            
            current = current.next;      
         }
      return current;                    
      }
   public Link delete(int key)    
      {                           
      Link current = first;              
      Link previous = first;
      while(current.studentID != key)
         {
         if(current.next == null)
            return null;                 
         else
            {
            previous = current;          
            current = current.next;
            }
         }                               
      if(current == first)               
         first = first.next;             
      else                               
         previous.next = current.next;   
      return current;
      }
   public void displayList()      
      {
      System.out.print("List (first-->last): ");
      Link current = first;       
      while(current != null)      
         {
         current.displayLink();   
         current = current.next;  
         }
      System.out.println("");
      }
   }  

public class final4_1
   {
   public static void main(String[] args)
      {
      LinkList theList = new LinkList();  

      theList.insertFirst(1, 87.5);      
      theList.insertFirst(2, 90.00);
      theList.insertFirst(3, 65.75);
      theList.insertFirst(4, 82.50);

      Collections.sort(theList);
      }  
   }  
//i wasn't sure what to do so i tried to use the COllections.sort();