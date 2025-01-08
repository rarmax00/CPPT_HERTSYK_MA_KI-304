import java.io.*;
import java.util.*;

/**
 * Lab1Hertsyk304
 * This program generates a square matrix filled with a user-specified character
 * following a specific pattern and writes the result to a file.
 *
 * Features:
 * - Accepts matrix size from the user.
 * - Allows the user to choose a single fill character.
 * - Generates a pattern where the number of fill characters increases until
 *   the middle row and decreases afterward.
 * - Outputs the result to both the console and a text file.
 */
public class Lab1Hertsyk304 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows; // Size of the square matrix
        char[][] arr; // Matrix to store the pattern
        String filler; // Character for filling the matrix
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Input the size of the matrix
        System.out.print("Enter the size of the square matrix: ");
        nRows = in.nextInt();
        in.nextLine(); // Read the newline character after the number input

        arr = new char[nRows][nRows]; // Initialize the square matrix

        // Input the fill character
        System.out.print("\nEnter the fill character: ");
        filler = in.nextLine();

        // Ensure only one character is provided
        if (filler.length() != 1) {
            System.out.println("\nYou must enter exactly one fill character.");
            return;
        }

        char fillChar = filler.charAt(0); // Extract the fill character

        // Determine the middle of the matrix
        int mid = nRows / 2;

        // Fill the matrix with the pattern
        for (int i = 0; i < nRows; i++) {
            int numFillChars; // Number of fill characters in the current row

            // Determine the number of fill characters for the current row
            if (i <= mid) {
                numFillChars = i + 1;
            } else {
                numFillChars = nRows - i;
            }

            // Fill the row with the character or spaces
            for (int j = 0; j < nRows; j++) {
                if (j < numFillChars) {
                    arr[i][j] = fillChar;
                } else {
                    arr[i][j] = ' '; // Fill remaining positions with spaces
                }

                // Output to the console and file
                System.out.print(arr[i][j] + " ");
                fout.print(arr[i][j] + " ");
            }
            System.out.print("\n");
            fout.print("\n");
        }

        // Flush and close the file output
        fout.flush();
        fout.close();
    }
}
