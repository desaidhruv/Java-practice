public class Final2 {
    final void run(){
        System.out.println("running");
    }
    public static class Bike extends Final2 {  
        void run() {
            System.out.println("running safely with 100kmph");
        }  
        
        public static void main(String args[]) {  
        Bike b= new Bike();  
        b.run();  
        }  
    }  
}
//This code will not run because due to final keyword used in the parent class method 
// it cannot be overridden in the child class so it shows error