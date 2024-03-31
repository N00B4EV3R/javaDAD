package Sarcina2;

public class MVC {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View(m);
        Controller c = new Controller(m,v);
    }
}
