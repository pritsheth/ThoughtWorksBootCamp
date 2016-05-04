/**
 * Created by Jerry on 20-04-2015.
 */
public class Rectangle {

    private int length;
    private int width;


    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }


    public int getArea(){
        return (length * width);
    }


}
