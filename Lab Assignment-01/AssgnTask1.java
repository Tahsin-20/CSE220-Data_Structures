//Assignment Task 01: Row Rotation Policy
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation( Integer examWeek, String[][] matrix ){
       Integer seat=examWeek-1;
        Integer c=0;
        int row=-1;

        while(c<seat){

            for(int i=0; i<matrix[0].length; i++){
                for(int j=matrix.length-1; j>0; j--){
                    String temp=matrix[j][i];
                    matrix[j][i]=matrix[j-1][i];
                    matrix[j-1][i]=temp;
                }
            }
            c++;
        }

        for(int i=0; i<matrix.length; i++){
            System.out.print("| ");
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j].equals("AA") || matrix[i][j].equals("BB") || matrix[i][j].equals("CC") || matrix[i][j].equals("DD")){
                    System.out.print(matrix[i][j]+" | ");
                }
                else{
                    System.out.print(matrix[i][j]+"  | ");
                }
            }
            System.out.println();
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j].equals("AA")){
                    row=i+1;
                }
            }
        }
        return row;
    }


    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        String[][] seatStatus = {
                {"A" , "B"  , "C"  , "D"  , "E"},
                {"F" , "G"  , "H"  , "I"  , "J"},
                {"K" , "L"  , "M"  , "N"  , "O"},
                {"P" , "Q"  , "R"  , "S"  , "T"},
                {"U" , "V"  , "W"  , "X"  , "Y"},
                {"Z" , "AA" , "BB" , "CC" , "DD"}
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);
        
        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        //This following should print modified seat status after rotation and return the current exam week
        Integer rowNumber = rowRotation( examWeek, seatStatus );
        //The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row "+rowNumber);
    }
}
