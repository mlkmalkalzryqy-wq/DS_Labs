
package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
        int []numbers={1,2,4,7,6,9,5};
        Arrays.sort(numbers);
        //int result=arr.LinearSearch(numbers,9);
        int result=arr.BinarySearch(numbers, 0, numbers.length-1, 9);


        if(result!=-1)
            System.out.println("Value Found at index:"+result);
        else
            System.out.println("Not found!");













        // Scanner scanner =new Scanner(System.in);
//        int []numbers=new int[5];

        //arr.input(numbers);
        // arr.revers_traversal(numbers);
        // arr.update(numbers,4,7);
        //arr.traversal(numbers);
        //arr.update(numbers,2,6);
        //arr.delete(numbers,2);
        //arr.ShiftLeft_Delete(numbers,2);

        //.traversal(numbers);




        //   System.out.println(Arrays.toString(numbers));
//        for(int num:numbers)
//            System.out.println(num);

    }
}

