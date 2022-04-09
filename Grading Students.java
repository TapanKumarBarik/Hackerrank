//https://www.hackerrank.com/challenges/grading/problem?isFullScreen=false



 public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here


    for(int i=0;i<grades.size();i++){
        
        if(
            ((grades.get(i)+2) %5==0  || (grades.get(i)+1) %5==0) 
             &&  
            ((grades.get(i)+2)>=40 || (grades.get(i)+1)>=40)){
            
            grades.set(i,grades.get(i)+5-(grades.get(i)%5) );
        }
    }
    
    return grades;
    }
