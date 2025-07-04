import java.util.Scanner;
public class AnalyzerChallenege{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a sentence");
String sentence = scanner.nextLine();

System.out.println(sentence.trim());


System.out.println(sentence.toLowerCase());

String[] words = sentence.split(" ");
System.out.println(words[0]);
System.out.println(words[1]);
System.out.println(words[2]);

System.out.println("Length : " + words[0].length());