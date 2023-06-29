package ArrayList.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ygor");
        names.add("Gabriel");
        names.add("Márcio");
        names.add("Dantas");
        names.add("Pedro");

        for(String elements: names){ // percorre toda o arrayList
            System.out.println(elements);
        }
    }
}
