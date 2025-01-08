package ki_304.Hertsyk.Lab5;

import java.io.*;
import java.util.*;

public class FioApp {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();

        try {
            obj.calculate(data);
            System.out.println("Result is: " + obj.getResult());
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");
            obj.readResBin("BinRes.bin");
            System.out.println("Result from binary file: " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result from text file: " + obj.getResult());
        } catch (ArithmeticException e) {
            System.err.println("Calculation error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}

class CalcWFio {
    private double result;

    public void calculate(double x) {
        double tanX = Math.tan(x);
        if (tanX == 0) {
            throw new ArithmeticException("Error: tan(x) is zero. Cannot calculate cotangent.");
        }

        double ctgX = 1 / tanX;
        double sinValue = Math.sin(8 * x - 1);

        if (sinValue == 0) {
            throw new ArithmeticException("Error: sin(8x - 1) is zero. Division by zero is not allowed.");
        }

        result = ctgX / sinValue;
    }

    public double getResult() {
        return result;
    }

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f", result);
        f.close();
    }

    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + " not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
}

