import java.util.*;

public class CodeGenerator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter fullnames: ");
                String fname = sc.nextLine();

                fname = fname.trim();
                fname = fname.toLowerCase();
                String names[] = fname.split(" ");

                String rtnfirstChar = names[0].substring(0,1);
                String rtnSecondChar = names[1].substring(0,1);
                System.out.println(rtnfirstChar.toUpperCase());
                System.out.println(rtnSecondChar.toUpperCase());

                StringBuilder sb_name = new StringBuilder(names[1]);
                sb_name = sb_name.reverse();

                String secret_cd = rtnfirstChar + rtnSecondChar + sb_name;
                System.out.println("Code name:" + secret_cd);

                for(int i = 0; i < secret_cd.length(); i++){
                        if (secret_cd.charAt(i) == 'x' || secret_cd.endsWith("a") || secret_cd.endsWith("e") ||
                            secret_cd.endsWith("i")     || secret_cd.endsWith("o") || secret_cd.endsWith("u")){
                            secret_cd += " Agent-X";
                                System.out.println(String.format(secret_cd));
                                break;
                        }else{
                                System.out.println("-007");
                                break;
                        }
                }

                System.out.print("Enter names: ");
                String _named = sc.nextLine();
                while(_named != "exit"){
                        System.out.print("Enter names: ");
                         _named = sc.nextLine();
                }

                /*System.out.println(names[0].compareTo(names[1]));

                String option = sc.nextLine();
                System.out.println("Choose between Hero & Villian Modes, Enter(H|V): ");

                if (option == "h" || option == "H"){

                }else if(option == "v" || option == "v"){

                }*/
        }
}