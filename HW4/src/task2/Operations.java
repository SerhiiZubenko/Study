package task2;

public enum Operations {

    ADDITION{
        public void action(int x, int y){
            System.out.println("Result = " + (x + y));}
    },
    SUBSTRACTION {
        public void action(int x, int y){
            System.out.println("Result = " + (x - y));}
    },
    MULTIPLICATION{
        public void action(int x, int y){
            System.out.println("Result = " + (x * y));}
    },
    DIVIDING{
        public void action(int x, int y){
            System.out.println("Result = " + (x / y));}
    };
    public abstract void action(int x, int y);

}
