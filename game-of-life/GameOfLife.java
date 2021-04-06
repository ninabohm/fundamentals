import gdp.stdlib.StdDraw;
import gdp.stdlib.StdIn;

public class GameOfLife{
    public static void main(String[] args) {

        int size_x_axis = StdIn.readInt();
        int size_y_axis = StdIn.readInt();
        int number_of_living_cells = StdIn.readInt();

        //Get initial living cells
        boolean[][] before_calc = new boolean [size_x_axis][size_y_axis];

        for(int i=0; i<number_of_living_cells; i++){
            before_calc[gdp.stdlib.StdIn.readInt()][gdp.stdlib.StdIn.readInt()] = true;
        }


        //Calculate canvas size
        int square_pixels = 25;
        int canvas_width = size_x_axis * square_pixels;
        int canvas_height = size_y_axis * square_pixels;

        StdDraw.setCanvasSize(canvas_width, canvas_height);


        boolean[][] after_calc = new boolean [size_x_axis][size_y_axis];

        while(true){
            int counter = 0;
            for(int x = 0; x < before_calc.length; x++){
                for(int y=0; y<before_calc[x].length; y++){

                    counter = 0;

                    if(before_calc[getX(x - 1, size_x_axis)][getY(y - 1, size_y_axis)]){
                        counter++;
                    }

                    if(before_calc[getX(x, size_x_axis)][getY(y - 1, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x + 1, size_x_axis)][getY(y - 1, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x - 1, size_x_axis)][getY(y, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x + 1, size_x_axis)][getY(y, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x - 1, size_x_axis)][getY(y + 1, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x, size_x_axis)][getY(y + 1, size_y_axis)]){
                        counter++;
                    }
                    if(before_calc[getX(x + 1, size_x_axis)][getY(y + 1, size_y_axis)]){
                        counter++;
                    }

                    //Rules for survival
                    if(before_calc[x][y] && (counter==2||counter==3) ){
                        after_calc[x][y] = true;
                        //System.out.println("writing to aft. with x,y " + x + " " + y);


                    }else if(!before_calc[x][y] && counter==3){
                        after_calc[x][y] = true;


                        //System.out.println("writing to aft. with x , y " + x + " " + y);

                    }else{
                        after_calc[x][y] = false;
                    }

                }
            }

          
            for(int x = 0; x < before_calc.length; x++) {
                for (int y = 0; y < before_calc[x].length; y++) {
                    before_calc[x][y] = after_calc[x][y];
                }
            }


            //Draw before_calc

            //Draw coordinate system
            StdDraw.setXscale(0,size_x_axis);
            StdDraw.setYscale(0,size_y_axis);

            //Draw coordinate axes(x0,y0, x1, y1)
            StdDraw.setPenColor(StdDraw.BLUE);

            for (int i = 0; i <= size_x_axis; i++) {
                for (int j = 0; j <= size_y_axis; j++){
                    StdDraw.line(0.0 , 0.0, i, 0.0);
                    StdDraw.line(0.0, 0.0, j, 0.0);
                    StdDraw.line(0.0, j, i, j);
                    StdDraw.line(i, 0.0, i, j);
                }
            }

            //Draw cells
            for(int x=0; x<before_calc.length; x++){
                for(int y=0; y<before_calc[x].length; y++){

                    if(before_calc[x][y]){
                        StdDraw.setPenColor(StdDraw.GREEN);
                        StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
                    }

                    if(!before_calc[x][y]){
                        StdDraw.setPenColor(StdDraw.WHITE);
                        StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
                    }
                }
            }

            StdDraw.show(200);

        }


    }

    //Functions to check whether x is exception that is out of bounds
    public static int getX(int x, int size){
        if(x < 0){
            return size -1;
        }

        if(x > size - 1){
            return 0;
        }

        return x;

    }


    public static int getY(int y, int size){
        if(y < 0){
            return size -1;
        }

        if(y > size - 1){
            return 0;
        }

        return y;
    }

}






