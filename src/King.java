public class King extends Piece{
    King(String id, boolean is_white){
        super(id,"King",0,is_white);
    }
    public void start_pos(Board board){
        if(is_white){
            history.insert('e',1);
        }
        else{
            history.insert('e',8);
        }

    }
    public boolean move(Board board, char i, int j){
        return true;
    }

    public boolean move_validator(char curr_i, int curr_j, char next_i, int next_j){
        if(Math.abs(next_j-curr_j)>1) return false;

        return true;
    }


    public boolean is_check(){
        return true;
    }
}