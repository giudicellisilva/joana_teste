public class Main {
    public static void main(String argv[]) {
        Praktomat.Submission sub = new Praktomat.Submission(2331, "System.out.println(\"Hello world.\");");
        Praktomat.Review r = Praktomat.runChecks(sub);
        System.out.println(r.failures);
        Log log = new Log();
        log.write("texto");
    }
}


