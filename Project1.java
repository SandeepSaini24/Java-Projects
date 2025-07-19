import java.util.Scanner;

class Project1 {
    String getComputerChoice(){
        String computerChoice="";
        int randomNumber = (int) (Math.random()*3+1);
        if (randomNumber == 1){
            computerChoice = "rock";
        }else if(randomNumber == 2){
            computerChoice = "paper";
        }else if(randomNumber == 3){
            computerChoice = "scissors";
        }
        return computerChoice;
    }
    
    String getResult(String userInput, String computerChoice){
        if(userInput.equals(computerChoice)){
            return "draw";
        }else if(userInput.equals("paper") && computerChoice.equals("rock")){
            return "win";
        }else if(userInput.equals("rock") && computerChoice.equals("scissors")){
            return "win";
        }else if(userInput.equals("scissors") && computerChoice.equals("paper")){
            return "win";
        }else{
            return "lose";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Project1 obj = new Project1();
        System.out.println("Enter rock, paper or scissors :");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        String computerChoice = obj.getComputerChoice();
        String Result = obj.getResult(userInput,computerChoice);
        System.out.println("User Input :"+ userInput);
        System.out.println("Computer Choice :"+ computerChoice);
        System.out.println("Result :"+ Result);
    }
}
