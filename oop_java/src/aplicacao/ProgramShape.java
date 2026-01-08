package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circle;
import entidades.Rectangle;
import entidades.Shape;
import entidades_enums.ShapeColors;

public class ProgramShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);

            System.out.print("Color(BLACK/BLUE/RED): ");
            ShapeColors color = ShapeColors.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shapeList.add(new Rectangle(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapeList.add(new Circle(color, radius));
            }
        }
        
        System.out.println("SHAPE AREAS:");

        for (Shape shape : shapeList) {
            System.out.println(String.format("%.2f",shape.area()));
        }
        sc.close();
    }
}
