package Threads;


public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            String name = Integer.toString(i + 1);
            Threads thread = new Threads(name);
            thread.start();
        }
    }
}