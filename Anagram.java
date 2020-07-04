import java.util.*;
class Main
{ 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    String s,s1,t,t1; 
    s=sc.nextLine(); 
    s1=sc.nextLine(); 
    t=s.toLowerCase(); 
    t1=s1.toLowerCase(); 
    char[] a=t.toCharArray(); 
    char[] b=t1.toCharArray(); 
    Arrays.sort(a); 
    Arrays.sort(b); 
    if(s.length()==s1.length()) 
    { 
      if(Arrays.equals(a,b)) 
      { 
        System.out.println("Anagram");
      } 
      else 
      { 
        System.out.println("Not an anagram"); 
      } 
    } 
    else
    { 
      System.out.println("Not anagram"); 
    } 
 }
}
