import java.io.*;
import java.util.*;

public class ArrayList001{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array list : ");
        int arraySize=sc.nextInt();        

        ArrayList<Integer> ArrayListObj=new ArrayList<Integer>(arraySize);

        for(int arrayindex=1;arrayindex<=arraySize;arrayindex++){
            ArrayListObj.add(arrayindex);
        }
        System.out.println(ArrayListObj);

        System.out.println("enter the index number to remove: ");
        int removingElement=sc.nextInt();
        ArrayListObj.remove(removingElement);
        System.out.print(ArrayListObj);
    }
}
