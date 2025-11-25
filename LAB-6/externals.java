package SEE;

import java.util.Scanner;

import Cie.internals;

public class externals extends internals {
    public int marks[] = new int[5];
    public int finalmarks[] = new int[5];

    public void SEEmarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter SEE marks for subject " + (i+1));
            marks[i] = sc.nextInt();
        }
    }

    public void Totalmarks() {
        for (int i = 0; i < 5; i++) {
            finalmarks[i] = (int)(marks[i] / 2.0) + internalmarks[i];
        }
    }
}
