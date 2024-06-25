package Score;

public class StudentReport {
    public static void main(String[] args) {
        int rollno [] = {1, 2, 3, 4, 5, 6, 7};
        String stdnames [] = {"manny", "deffy", "jane", "austen", "ayre", "jonah", "billy"};
        String subjects [] = {"Science", "Maths", "English"};
        int totalmarks = 300;
        double passing = 300.00 * 0.4;

System.out.println("passing marks"+passing);
        int marks [][] = {
            {85, 60, 71},
            {45, 70, 31},
            {49, 50, 81},
            {56, 40, 76},
            {78, 70, 55},
            {99, 80, 91},
            {19, 10, 21}
        };
        int[] studentMarksTotal = new int[rollno.length];
        int highestmarks=studentMarksTotal[0];
        String studentWithHighest="";
        for(int i=0; i<rollno.length; i++){
            // System.out.println("lemngth"+rollno.length);
            int secured = 0;
            String grade ="";
            System.out.println("Student Name : "+ stdnames[i] + " Roll Is "+ rollno[i]);
           
        
                for (int j = 0; j < subjects.length; j++) {
                    if(marks[i][j] > 90){
                        grade = "A"; 
                    }else if(marks[i][j] >= 75 && marks[i][j] < 90){
                        grade = "B"; 
                    }else if(marks[i][j] >= 55 && marks[i][j] < 75){
                        grade = "C"; 
                    }else if(marks[i][j] >= 40 && marks[i][j] < 55){
                        grade = "D"; 
                    }else{
                        grade = "F"; 
                    }
                    System.out.println(subjects[j] + "\t" + marks[i][j] +" : "+grade);
                    secured = secured +  marks[i][j];
                }
                System.out.println("Marks Secured : " +secured+ "/" +totalmarks);
                if(secured >= passing){
                    System.out.println("Promoted");
                }else{
                    System.out.println("Successfully Failed");

                }
                System.out.println("\n");
            
                    studentMarksTotal[i]= secured;
           
                secured=0;            }
                for(int k=0; k<rollno.length; k++){
                    System.out.println( stdnames[k]+" : "+studentMarksTotal[k]);
                    
                    if(studentMarksTotal[k]>highestmarks){
                        highestmarks = studentMarksTotal[k];
                        studentWithHighest = stdnames[k];
                    }
                }
                System.out.println("_______________________________"+"\n");
                System.out.println(studentWithHighest + " has highest marks : "+ highestmarks + " of " +totalmarks );
                
            }

        

}
