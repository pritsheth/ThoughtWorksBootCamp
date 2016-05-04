/**
 * Created by Jerry on 21-04-2015.
 */
public class Client {


    public static void main(String args[]) {


        try {

            if (args.length == 1) {
                Square square = new Square(Integer.parseInt(args[0]));
                System.out.println(square.getArea());
            } else if (args.length == 2) {
                Rectangle rectangle = new Rectangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                System.out.println(rectangle.getArea());
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }



    }
}
