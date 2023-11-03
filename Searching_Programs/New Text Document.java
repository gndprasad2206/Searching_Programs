/*Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message. 

Here's a sample input and output for the above question: 

------------------------------------------------------------- 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 67 

Expected Output: 

67 is present in 2nd index position and it is a prime number 

Sample Input: 

A = [23,45,67,78,86,90] 

Target element is: 86 

Expected Output: 

86 is present in 4th index position and it is not a prime number 

 */
import java.util.*;
class Sort_7{
  public int binarySearch(int arr[],int key){
    int low=0,high=arr.length-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]==key){
        return mid;
      }
      else{
        if(arr[mid]<key){
          low=mid+1;
        }
        else{
          high=mid-1;
        }
      }
    }
    return -1;
  }
  public void isprime(int val,int index){
    int count=0;
    for(int i=1;i<=val;i++){
      count++;
    }
    if(count==2){
      System.out.println(val+" is present in "+index+"th index position and it is  a prime number");
    }
    else{
      System.out.println(val+" is present in "+index+"th index position and it is not a prime number");
    }
  }
    
  }

public class BinarySearch_7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Sort_7 s=new Sort_7();
    System.out.println("Enter the range of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Array Element");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Enter the key element: ");
    int key=sc.nextInt();
    int index=s.binarySearch(arr,key);
    if(index!=-1){
      int val=arr[index];
      s.isprime(val,index);
    }
    else{
      System.out.println("Target Element is not found");
    }
  }
}