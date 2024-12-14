public class Todo {
    private Integer id;
    private String judul;
    private String isiTodo;
    private String dateTime;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", judul='" + judul + '\'' +
                ", isi" + isiTodo + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }

    public Todo(Integer id, String judul, String isiTodo, String dateTime) {
        this.id = id;
        this.judul = judul;
        this.isiTodo = isiTodo;
        this.dateTime = dateTime;
    }

    public Todo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsiTodo() {
        return isiTodo;
    }

    public void setIsiTodo(String isiTodo) {
        this.isiTodo = isiTodo;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
