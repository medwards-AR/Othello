
/**
 * @author me023229
 *
 */
public class Othello_Board extends Board {
	
	public Othello_Board(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	public char[][] createBoard(int size) {
		board= new char[size][size];
    	for(int i = 0; i < board.length; i++){
    		for(int j = 0; j < board.length; j++){
    			board[i][j] = '-';
    			if(i = 3) {
    				
    			}
    		}
    	}
    	return board;
	}
	

}
