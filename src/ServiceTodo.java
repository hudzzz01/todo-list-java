import java.util.ArrayList;
import java.util.List;

public class ServiceTodo implements CrudTodo {
    List<Todo> todos = new ArrayList<>();


    @Override
    public Todo create(Todo todo) {

        //check is unique
        try {
            cekUniqueId(todo.id);
        }catch (Exception e){
            System.out.println(e);
        }

        //add todo
        try {
            addTodo(todo);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("berhasil menambah Todo !");

        return todo;
    }

    @Override
    public ArrayList<Todo> read() {
        return null;
    }

    @Override
    public Integer update(Integer id) {
        return 0;
    }

    @Override
    public Integer delete(Integer id) {
        return 0;
    }

    void cekUniqueId(Integer id) throws Exception {
        Boolean isUnique;
        for(Todo todo : todos){
            if (todo.id.equals(id)) throw new Exception("Id tidak dapat digunakan");
        }
    }

    void addTodo(Todo todo) throws Exception {
        Integer todosSize = todos.size();
        todos.add(todo);
        if(todosSize.equals(todos.size())) throw new Exception("gagal membuat todo");
    }


}

