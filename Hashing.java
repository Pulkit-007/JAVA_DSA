import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(1);
        System.out.println(st);
        System.out.println(st.size());


        //search/contains
        if(st.contains(1))
        {
            System.out.println("set contains 1");
        }

        st.remove(1);

        if(!st.contains(1))
        {
            System.out.println("set does not contain 1");
        }
        Iterator it=st.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
