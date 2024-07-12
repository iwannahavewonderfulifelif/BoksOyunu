public class Main {
    public static void main(String[] args) {
        Boxer b1 = new Boxer("Anastasia", 10, 120, 100,100);
        Boxer b2 = new Boxer("Asu", 20, 85, 85,0);
Match match=new Match(b1,b2,85,100);
match.run();
    }}
