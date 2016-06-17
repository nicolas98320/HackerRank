import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +   "\nID: " + idNumber); 
    }
     
}

class Student extends Person{
    private int[] score;
   
    Student(String fn, String ln, int id, int[] score){
        
        super(fn,ln,id);
        this.score = score;
        
    }

    
    public char calculate (){
        
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        int av = sum / score.length;        

        if(av >= 90 && av <= 100){
            return 'O';
        } else if(av >= 80 && av < 90){
            return 'E';
        } else if(av >= 70 && av < 80){
            return 'A';
        } else if(av >= 55 && av < 70){
            return 'P';
        } else if(av >= 40 && av < 55){
            return 'D';
        } else {
            return 'T';
        }

    }
}
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}