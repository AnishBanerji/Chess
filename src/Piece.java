import DS.*;
public abstract class Piece{
    String id;
    String name;
    int type;
    LinkedList history;
    boolean is_white;
    Piece(String id, String name, int type, boolean is_white){
        this.id=id;
        this.name=name;
        this.type=type;
        this.history=null;
        this.is_white=is_white;
    }
    public abstract void start_pos(Board board);
    public abstract boolean move(Board board, char i, int j);
    public abstract boolean move_validator(char curr_i, int curr_j, char next_i, int next_j);
}