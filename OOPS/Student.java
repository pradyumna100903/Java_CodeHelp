public class Student {

        // Attributes 
        public int id;
        public int age;
        public String name;
        public int nos;

        // Default Constructor // atre-> garbage / zero 
        public Student() {
            System.out.println("Student Default Constructor Called ");

        }
        // Parameterized Constructor
        public Student(int id, int age, String name , int nos) {
            
            this.id=id;
            this.age=age;
            this.name=name;
            this.nos=nos;
            
        }

        // Methods amd Behaviours 
        public void study() {
                System.out.println(name + " is studying.");
        }

        public void sleep() {
                System.out.println(name + " is sleeping.");
        }   

        public void bunk() {
                System.out.println(name + " is bunking.");
        } 
        
    



}
