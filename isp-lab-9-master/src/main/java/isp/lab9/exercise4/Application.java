package isp.lab9.exercise4;

public class Application {
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View("Sensors");
        Controller c = new Controller(m, v);
        c.initController();
    }
}
