import java.util.*;
class arr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        int del=pos-1;
        if(pos>n){
            System.out.println("Invalid number!"+" ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(del==i){
                    continue;
                }
                else{
                    System.out.print(arr[i]);
                }
            }
        }
    }
}