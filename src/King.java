public class King extends Piece{
    King(String id, boolean is_white){
        super(id,"King",0,is_white);
    }
    public void start_pos(){
        if(is_white){
            history.insert('e',1);
        }
    }
    public boolean move(Board board, char i, int j){
        return true;
    }

    public boolean move_validator(char curr_i, int curr_j, char next_i, int next_j){

        return true;
    }

    public boolean is_check(){
        return true;
    }
}