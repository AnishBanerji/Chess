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
        if(move_validator(history.tail.i,history.tail.j,i,j)){
            if(board.is_occupied(i,j) != null){
                board.kill(board.is_occupied(i,j));
            }
            board.move(this,i,j);
        }
        return true;
    }

    public boolean move_validator(char curr_i, int curr_j, char next_i, int next_j){
        if(Math.abs(next_j-curr_j)>1) return false;
        return Math.abs(next_i - curr_i) <= 1 && !is_check();
    }


    private boolean is_check(){
        return true;
    }
}