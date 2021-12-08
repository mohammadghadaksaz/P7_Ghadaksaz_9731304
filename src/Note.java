public class Note extends File{

    String title;
    String content;
    String date;

    public Note(String title, String content, String date){

        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString(){
       String text = "Title: " + getTitle() + "\tContent: " + getContent() + "\tDate: " + getDate();
        return text;
    }
}
