import java.util.Scanner;
import java.util.Random;

public class rock_paper_seasor {
    public static void main(String[] argu) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rn = new Random();

            System.out.println("Please Enter your neme:");
            String name = sc.nextLine();
            System.out.println("\nhello "+name.toUpperCase()+", wellcome to Rock Paper Seasor Gameplay.\n\tIn every set there is 5 round and you have to win atleast 3 round to win the game.\n\nNow press R for selecting Rock, P for Paper or S for Seasor in your Keyboard.");

            int u_count = 0;
            int s_count = 0;
            
            for (int i = 1; i <= 5; i++) {
                int con = rn.nextInt(100) % 3;  
                String u = sc.next();
                u = u.toUpperCase();
                String s;

                switch (con) {

                    case 0 -> {
                        s = "R";
                        System.out.println(s);

                        switch (u) {
                            case "R" -> {
                                System.out.println("drow");
                            }
                            case "P" -> {
                                System.out.println("Good job");
                                u_count += 1;
                            }
                            case "S" -> {
                                System.out.println("Ohh! Ohh!! iam lucky this time");
                                s_count += 1;
                            }
                            default-> {
                                System.out.println("Invelid input, System get the point.");
                                s_count+=1;
                            }
                        }
                    }
                    
                    case 1 -> {
                        s = "P";
                        System.out.println(s);
                        switch (u) {
                            case "P" -> {
                                System.out.println("drow");
                            }
                            case "R" -> {
                                System.out.println("Ohh! Ohh!! iam lucky this time");
                                s_count += 1;
                            }
                            case "S" -> {
                                System.out.println("Good job");
                                u_count += 1;
                            }
                            default-> {
                                System.out.println("Invelid input, System get the point.");
                                s_count+=1;
                            }
                        }
                    }
                    
                    case 2 -> {
                        s = "S";
                        System.out.println(s);
                        switch (u) {
                            case "S" -> {
                                System.out.println("drow");
                            }
                            case "P" -> {
                                System.out.println("Ohh! Ohh!! iam lucky this time");
                                s_count+=1;
                            }
                            case "R" -> {
                                System.out.println("Good job");
                                u_count += 1;
                            }
                            default-> {
                                System.out.println("Invelid input, System get the point.");
                                s_count += 1;
                            }
                        }
                    }
                }
            }

            if(u_count>s_count){
                System.out.println("\n\n\n\tCongratulation! You win.\n");
            }
            else if(u_count<s_count){
                System.out.println("\n\n\n\tOh! Ohh!! Batter Luck Next Time.\n");
            }
            else{
                System.out.println("\n\n\n\tMatch Draw.\n");
            }
        }

    }
}