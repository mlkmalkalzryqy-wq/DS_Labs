
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
    Scanner scanner=new Scanner(System.in);
    public void traversal(int []numbers){

        System.out.println("the elements are :");
        for(int i=0;i<numbers.length;i++)
            System.out.println("index["+i+"]"+" ,element: "+numbers[i]);


    }
    public void revers_traversal(int []numbers){

        System.out.println("the reversed elements are :");
        for(int i=numbers.length-1;i>=0;i--)
            System.out.println("index["+i+"]"+" ,element: "+numbers[i]);


    }
    public void input(int []numbers){

        System.out.println(" please enter "+numbers.length+" numbers:");
        for (int i=0; i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
    }
    public void update(int []numbers, int index ,int nelement){
        if(index<0 || index>=numbers.length)
            System.out.println("Index not found");
        else
            numbers[index]=nelement;
        //  return index;
    }
    public void delete(int []numbers, int index ){
        if(index<0 || index>=numbers.length)
            System.out.println("Index not found");
        else
            numbers[index]=0;
        //  return index;
    } //{1,2,3,4,5}
    public void ShiftLeft_Delete(int []a,int index){
        for(int i=index;i<a.length-1;i++)
            a[i]=a[i+1];

        a[a.length-1]=Integer.MIN_VALUE;
    }


    public int LinearSearch(int []a, int svalue){
        for (int i=0; i<a.length;i++){
            if (svalue==a[i])
                return i;
        }

        return -1;
    }
    //{1,2,3,4,5,6}     s=5   f=0   , l=5
    public int BinarySearch(int[]a, int findex, int lindex,int svalue){
        while (findex<=lindex){
            int mid=(findex+lindex)/2;
            // System.out.println("mid ="+mid);//4
            if(svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;  //3
            if(svalue<a[mid])
                lindex=mid-1;
        }


        return -1;
    }









}
