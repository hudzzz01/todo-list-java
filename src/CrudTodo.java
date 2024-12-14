import java.util.ArrayList;

public interface CrudTodo {
    Todo create(Todo todo);
    ArrayList<Todo> read();
    Integer update(Integer id, String judul, String isi, String dateTime);
    Integer delete(Integer id);
}
