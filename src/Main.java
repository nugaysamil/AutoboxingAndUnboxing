import java.util.ArrayList;

public class Main {

    ArrayList<String> arrayList = new ArrayList<String>();


    //ArrayList<int> arrayList2 = new ArrayList<int>();

    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++){

        arrayList2.add(Integer.valueOf(i*4)); // AutoBoxing
    }

    for (int i = 0; i < arrayList2.size(); i++) {
        System.out.println(arrayList2.get(i).intValue()); //unboxing
    }
}





