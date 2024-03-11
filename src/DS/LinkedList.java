package DS;

public class LinkedList {
    public LLNode head;
    public LLNode tail;
    int len;
    public LLNode insert(char i, int j){
        LLNode tbi = new LLNode(i,j);
        if(head == null){
            head=tbi;
            tail=tbi;
            return tbi;
        }
        tail.next=tbi;
        tail=tbi;
        return tbi;
    }
}
