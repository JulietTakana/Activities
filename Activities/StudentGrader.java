import java.util.Scanner;

class StudentGrader{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int score;
String retry = "yes";

System.out.println("Enter your score");
int input = scanner.nextInt();

score = input + 5;

if(input < 40){
score = input - 2;
System.out.println("Your score -2 is: " + score);
}

if(score >=50){
System.out.println("Final Score is: " + score);
System.out.println("Pass");
}else{
System.out.println("Fail");
}

String status = (score >= 80) ? "Excellent"
:(score >= 60 && score <= 79) ? "Good"
:"Needs improvement";
System.out.println("Status: " + status);

//Switch statement
switch(score){
case 0:
case 5:
System.out.println("Nice round number");
break;

case 1:
case 2:
case 3:
case 4:
System.out.println("Low tail");
break;

case 6:
case 7:
case 8:
case 9:
System.out.println("High tail");
break;

default:
System.out.println("Interesting score");
}

System.out.println("Do you want to retry the grading process?");
scanner.nextLine();
retry = scanner.nextLine();

while(retry.equals("yes")){
System.out.println("Enter your exam score");
input = scanner.nextInt();


if(input < 40){
score = input - 2;
}

if(score >= 50){
System.out.println("Pass");
}else{
System.out.println("Fail");
}

status = (score >= 80) ? "Excellent"
:(score >= 60 && score <= 79) ? "Good"
:"Needs improvement";
retry += 0;
System.out.println("Status: " + status);

}
String exitAnswer;

do{
System.out.println("Do you want to exit the program? (Yes/No)");
exitAnswer = scanner.nextLine();

}
while (!exitAnswer.equals("yes"));
scanner.close();
System.out.println("You have exited the program!");
}
}