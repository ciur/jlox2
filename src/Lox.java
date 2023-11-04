import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class Lox {
    static boolean hadError = false;

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
        String source = new String(byteps, Charset.defaultCharset());

        run(source);

        if (hadError) {
            System.exit(65);
        }
    }

    private static void run(String source) throws IOException {
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        for (Token token: tokens) {
            System.out.println(token);
        }
    }

    static void error(int line, String message) {
        report(line, "", message);
    }

    private static void report(int line, String where, String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message
        );
        hadError = true;
    }
    private static void runPrompt() {
        System.out.println("runPrompt");
    }
}