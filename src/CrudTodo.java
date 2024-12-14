import java.util.ArrayList;

public interface CrudTodo {
    Todo create(Todo todo);
    ArrayList<Todo> read();
    Integer update(Integer id);
    Integer delete(Integer id);
}
