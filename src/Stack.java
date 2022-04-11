import java.util.ArrayList;

public class Stack {

    ArrayList<Object> Stack = new ArrayList<>();

    public String top(){
        return (String) this.Stack.get(Stack.size()-1);
    }

    public void push(String s) {
        this.Stack.add(s);
    }

    public void pop() {
        this.Stack.remove(Stack.size()-1);
    }

    public boolean empty() {
        return Stack.size() != 0;
    }

    public int length() {
        return Stack.size()-1;
    }
}
