import java.util.Scanner;
class LinearSearch{
  public int linSearch(int arr[],int key,int n){
    for(int i=0;i<n;i++){
      if(arr[i]==key){
        return i;
      }
    }
    return -1;
  }
}
public class LinearSearchKey{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number Of Elemnts to be Store in Array");
    int n=sc.nextInt();
    int  arr[]=new int[n];
    System.out.println("Entre the elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter key value ");
    int key=sc.nextInt();
    LinearSearch li=new LinearSearch();
    int check=li.linSearch(arr,key,n);
    if(check!=-1){
      System.out.println("The key element "+key+" is found in index of "+check);
    }
    else{
      System.out.println(key+" is not found");
    }
  }
}