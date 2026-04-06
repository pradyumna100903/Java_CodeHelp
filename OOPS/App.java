public class App {
   
    public static void main(String[] args) {
        
    // Default Constructor 

    // Student A = new Student();
    // A.id=1;
    // A.age=21;
    // A.name = "Praddy";
    // A.nos=4;

    // System.out.println(A.name);
    // System.out.println(A.id);
    // System.out.println(A.age);
    // System.out.println(A.nos);


    // A.bunk();
    // A.sleep();
    // A.study();


   // Parameterised Constructor 
        Student A = new Student(1, 21 , "Praddy" , 4);

    System.out.println(A.name);
    System.out.println(A.id);
    System.out.println(A.age);
    System.out.println(A.nos);


    A.bunk();
    A.sleep();
    A.study();





    }
}
