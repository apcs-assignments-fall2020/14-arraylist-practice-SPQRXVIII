import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count =0;
        for(int i=0;i<list.size(); i++){
            if( (list.get(i))*(list.get(i))%2 == 1)count+=1;
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        int n;
        boolean a = false;
        if(list1.size()>=list2.size())n=list2.size();
        else n=list1.size();

        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){

            if(list2.get(i)==list1.get(j)){a=true; break;}}
                if (a==true)break;
        }
        return a;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i: arr){
            list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
