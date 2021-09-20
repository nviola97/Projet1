package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        var product = new ArrayList<String>();
        var price = new ArrayList<Float>();
        var numAvailable = new ArrayList<Integer>();
        var fileName = "productList";
        var filePath = Paths.get(fileName);
        var allLines = Files.readAllLines(filePath);
        for (var line: allLines){
            var splitLine = line.split(",");
            product.add(splitLine[0]);
            price.add(Float.parseFloat(splitLine[1]));
            numAvailable.add(Integer.parseInt(splitLine[2]));
    }
        //for (int i = 0; i< product.size(); i++){
            //System.out.println( product.get(i)  +"     "+ price.get(i)+"      "  +  numAvailable.get(i));

        var productName = "";
        var reader = new Scanner(System.in);
         while (!productName.equals("DONE")){
            System.out.println("Enter product name if done type DONE: ");
            productName = reader.nextLine();

        }
        }
}
