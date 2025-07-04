import java.util.Scanner;


public class StepsGame{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please enter your name: ");
String name = scanner.nextLine(); 

if (name.isEmpty()) {
System.out.println("Name cannot be empty!");

System.exit(0);

}

System.out.println("Hello " + name + "!");


System.out.println("The name has " + name.length() + " characters.");

System.out.println("First character: " + name.charAt(1));

System.out.println("Last character: " + name.charAt(name.length() - 1));

if (name.contains("a") || name.contains("A")){
System.out.println("Your name contains the letter 'a' or 'A'");
}else
{
System.out.println("No 'a' or 'A' found in your name");
}

String replaced = name.replaceAll("[aeiouAEIOU]", "''");
System.out.println(replaced);

for(int i = 0; i < name.length(); i++){
for(int a = 0; a <= i; a++){
System.out.println(name.charAt(a) + " ");
}
System.out.println();
}

for(int i = 0; i <= name.length(); i++){

if(i == 3){
continue;
}
if(i == 5){
break;
}
System.out.println("Counting: " + i);
}

String result = String.format("Thanks, %s for playing the String Steps Game", name);  
System.out.println(result);

System.out.println("Please enter a second word: ");
String secondWord = scanner.nextLine();

System.out.println(name.equals(secondWord));

System.out.println(name.concat(secondWord));

}
}