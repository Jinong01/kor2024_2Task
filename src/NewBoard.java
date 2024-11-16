public class NewBoard {
    private String content;
    private String writer;
    private int pwd;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public NewBoard(String content, int pwd, String writer) {
        this.content = content;
        this.pwd = pwd;
        this.writer = writer;
    }

    public NewBoard() {}

    @Override
    public String toString() {
        return "NewBoard{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}
