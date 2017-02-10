/**
 * Created by SerLonic on 05.02.2017.
 * while, do - while
 */
public class JavaApp6 {
    public static void main(String[] args)
    throws java.io.IOException{ //for System.in.read()

        int time = 10;
        while (time>0){
            if (time>=5){
                System.out.println("We have a many time");
            }else {
                System.out.println("We have a few time");
            }
            time--;
        }

        int minScore = 0;
        int maxScore = 100;
        while (++minScore < --maxScore); //cycle without body
        System.out.println("Middle score equal = " + minScore);

        char selection;
        do{
            System.out.println("Select action: ");
            System.out.println("1 - to go");
            System.out.println("2 - to ride");
            System.out.println("3 - to fly");
            selection = (char) System.in.read();
        }while ('0' < selection || selection > '4'); //cycle if invalid selection
        switch (selection){
            case '1':
                System.out.println("You select 'to go' 2");
                break;
            case '2':
                System.out.println("You select 'to ride' ");
                break;
            case '3':
                System.out.println("You selected 'fly' ");
                break;
        }
        System.out.println("Thanks you");
    }
}
