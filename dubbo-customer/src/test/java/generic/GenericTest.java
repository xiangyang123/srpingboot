package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zouxiang on 2017/7/12.
 */
public class GenericTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
//        list.add("123");
//        list.add("456");
        list.add(100);
//                 for (int i = 0; i < list.size(); i++) {
//                         String name = (String) list.get(i); // 1
//                         System.out.println("name:" + name);
//                     }
                     List<Number> lists = new ArrayList<>();
                     Number b = 1;
                     Number c= 2L;
                     Number d = 3.0f;
                     Number f = 4.0d;
                     short e = 5;
                     byte g = 6;
                     lists.add(b);
        lists.add(c);
        lists.add(d);
        lists.add(f);
        lists.add(e);
        lists.add(g);
                     addList(lists);
    }

    public static void addList(List<? extends Number> list){
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
