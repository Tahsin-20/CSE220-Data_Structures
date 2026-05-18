//Assignment Task 04: Rotate Secret
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //If needed you can create extra helper static methods
    //if extra helper methods are used then you must submit those as well
     public static void rotateSecret(Character[][] board) {
        int row=board.length;
        int col=board[0].length;
        
        int layer_no=row/2;

        for(int i=0; i<layer_no; i++){
            int rotation_no=layer_no-i;
            int c=0;
            while(c<rotation_no){
                int top_wall=i;
                int left_wall=i;
                int bottom_wall=row-i-1;
                int right_wall=col-i-1;
                char temp=board[top_wall][right_wall];

                //Shifting left to right
                for(int j=right_wall; j>left_wall; j--){
                    board[top_wall][j]=board[top_wall][j-1];
                }
                //Shifting bottom to top
                for(int j=top_wall; j<bottom_wall; j++){
                    board[j][left_wall]=board[j+1][left_wall];
                }
                //Shifting right to left
                for(int j=left_wall; j<right_wall; j++){
                    board[bottom_wall][j]=board[bottom_wall][j+1];
                }
                //Shifting top to bottom
                for(int j=bottom_wall; j>top_wall; j--){
                    board[j][right_wall]=board[j-1][right_wall];
                }
                //Putting the temp value in the empty position that was formed due to shifting
                board[top_wall+1][right_wall]=temp;
                c++;
            }
        }
     }

        

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
          {'T','A','U','S'},
          {'A','R','I','.'},
          {'D','T','T','N'},
          {'S','C','F','U'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
            {'D','A','T','A'},
            {'S','T','R','U'},
            {'C','T','I','S'},
            {'F','U','N','.'}
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 1 Success");
        else System.out.println("Test 1 FAILED");
        
        System.out.print("\n===========Test#2===========\n");

        board = new Character[][]{
          {'O','R','I','R','N','P'},
          {'G','S','A','A','L','R'},
          {'L','M','N','O','N','Y'},
          {'A','H','U','O','O','P'},
          {'T','F','C','T','H','S'},
          {'E','D','Y','O','C','K'}
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][]{
            {'A','L','G','O','R','I'},
            {'T','H','M','S','A','R'},
            {'E','F','U','N','A','N'},
            {'D','C','O','O','L','P'},
            {'Y','T','H','O','N','R'},
            {'O','C','K','S','P','Y'}
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKS\n");
        Arr.print2D(outputBoard);
        
        System.out.print("\nYour Output:\n");
        rotateSecret( board );
        Arr.print2D(board);
        
        if( Arr.compare2D(outputBoard, board) ) System.out.print("Test 2 Success");
        else System.out.println("Test 2 FAILED");
    }
}
