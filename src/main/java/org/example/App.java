package org.example;


import org.example.model.*;

public class App {

    public static void main(String[] args) {

        Figure[] arr = new Figure[5];
        arr[0] = new Triangle("red", 5.5, 7.0);
        arr[1] = new Triangle("red", 5.0, 7.5);
        arr[2] = new Circle("blue", 4.7);
        arr[3] = new Square("yellow", 8.0);
        arr[4] = new Trapeze("green", 3.0, 9.0, 5.0, 6.0);

        App app = new App();
        app.showAllFigures(arr);
    }

    private void showAllFigures(Figure[] arr) {
        for (Figure figure : arr) {
            System.out.println(figure);
        }
    }
}
