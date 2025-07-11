import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the pattern: ");
        Scanner scan = new Scanner(System.in);
        String movements = scan.nextLine();
        short altitude = 0;
        short valleyCount = 0;
        for(int i =0; i<movements.length(); i++){
            if(movements.charAt(i) == 'U')
                altitude += 1;
            else if (movements.charAt(i)=='D') {
                altitude -= 1;
            }

            if (altitude == 0 && movements.charAt(i) == 'U'){
                valleyCount++;
            }
        }
        System.out.printf("Number of valleys: %d",valleyCount);

    }
}