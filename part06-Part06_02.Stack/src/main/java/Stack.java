
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<String>();
    }
    
    public boolean isEmpty() {  
        return this.stack.isEmpty();
    }   
    
    public void add(String value) {
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        int lastIndex = this.stack.size() - 1;
        String last = this.stack.get(lastIndex);
        this.stack.remove(lastIndex);
        return last;
    }
    
}
