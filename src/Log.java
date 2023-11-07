public final class Log {
    private final StringBuilder content;
    public Log() {
        content = new StringBuilder();
    }
    public void write(String s) {
        content.append(s);
    }
}