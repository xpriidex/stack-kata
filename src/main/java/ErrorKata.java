/**
 * Created by Felipe on 4/12/2017.
 */
public class ErrorKata extends Exception {
    private static final long serialVersionUID=1L;
    public ErrorKata(){
        super();
    }
    public ErrorKata(String message, Throwable cause){
        super(message,cause);

    }
    public ErrorKata(String message){
        super(message);

    }
    public ErrorKata(Throwable cause){
        super(cause);

    }
}
