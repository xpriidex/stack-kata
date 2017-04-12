/**
 * Created by Felipe on 4/12/2017.
 */
public class StackKata {
    Boolean isEmpty=true;
    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(int i) {
        isEmpty=false;
    }
}
