package utilies;

public class Parser {

    public Parser() {

    }

    public String[] getTokens(String line) {
        if(!line.isEmpty()) {
            return line.split(",");
        }else {
            return null;
        }
    }
}