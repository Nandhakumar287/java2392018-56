import java.io.*;
import java.util.*;
  public class Kodd{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value");
      int n=sc.nextInt();
      System.out.println("Enter K value");
      int k=sc.nextInt();
      int na[]=new int[n];
      int count=0;
      System.out.println("Enter Elements:");
      for(int i=0;i<n;i++)
      {
      na[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
      if(na[j]%2!=0)
      {
      count++;
      if(count==k)
      {
        System.out.println("Kth Position Odd Number is->"+na[j]);
      }
      }
      }
    }
  }  
      
