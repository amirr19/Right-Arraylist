import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("pls inter ur list number\n like this:\t 1 2 3 43 42 ...");
        String input = sc.nextLine();
        for (String item : input.split(" ")) {
            arrayList.add(String.valueOf(item));
        }
        System.out.println(arrayList);

        correctEvenSize(arrayList);
        List<String> finallArray = new ArrayList<>();
        int size = 2;
        for (int start = 0; start < arrayList.size(); start += size) {
            int end = Math.min(start + size, arrayList.size());
            List<String> sublist = arrayList.subList(start, end);
            if (verify(sublist)){
                System.out.println(sublist);
                finallArray.add(sublist.get(0));
                finallArray.add(sublist.get(1));
            }
        }
        System.out.println(finallArray);
    }
    public  static boolean verify (List sublist){
        long first = Long.valueOf((String) sublist.get(0));
        long second = Long.valueOf((String) sublist.get(1));
        boolean ans=false;
        if (first < second) {
            ans=true;
        }
        return ans;
    }
    public static List<String> correctEvenSize(List list){
        int sizeOfArray=0;
        if (list.size()%2!=0){
         list.remove(list.size()-1);
        }
        return list;
    }
}
