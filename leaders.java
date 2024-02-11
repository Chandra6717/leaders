import java.util.Scanner;  //leaders
class maxfromright{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
// {1,43,24,6,42,21,4}===4,21,42,43
        int max_elm=0;
        for(int i=n-1;i>=0;i--){
            if(max_elm<arr[i]){
                max_elm=arr[i];
                System.out.print(max_elm+" ");
            }
        }
    }
}