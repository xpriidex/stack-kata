import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felipe on 4/12/2017.
 */
public class StackKata {
    private List<Integer> stack= new ArrayList<Integer>();
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int i) {
        stack.add(i);
    }

    public int tam() {
        return stack.size();

    }

    public int pop() {

        return stack.remove(tam()-1);
    }
}
