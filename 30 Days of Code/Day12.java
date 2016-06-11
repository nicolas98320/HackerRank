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