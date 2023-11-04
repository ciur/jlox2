import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length > 1) {
            System.out.println("Usage: jlox [script]");
            System.exit(64);
        } else if (args.length == 1){
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }
    private static void runFile(String path) throws IOException {
        byte[] byteps = Files.readAllBytes(Paths.get(path));
        String s = new String(byteps, Charset.defaultCharset());

        System.out.println(s);
    }
    private static void runPrompt() {
        System.out.println("runPrompt");
    }
}