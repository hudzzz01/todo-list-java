import java.util.ArrayList;
import java.util.List;

public class ServiceTodo implements CrudTodo {
    List<Todo> todos = new ArrayList<>();


    @Override
    public Todo create(Todo todo) {

        //check is unique
        try {
            cekUniqueId(todo.getId());
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }

        //add todo
        try {
            addTodo(todo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("berhasil menambah Todo !");

        return todo;
    }

    @Override
    public ArrayList<Todo> read() {
        System.out.println(todos);
        return (ArrayList<Todo>) todos;
    }

    @Override
    public Integer update(Integer id, String judul, String isi, String dateTime) {
        //cek apakah id ada
        try {
            cekIsIdContain(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
        //getIndexFromId
        int index = 0;
        try {
            index = getIndex(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //update todo from index
        todos.set(index,new Todo(id,judul,isi,dateTime));



        return 0;
    }

    @Override
    public Integer delete(Integer id) {
        //cek apakah id ada
        try {
            cekIsIdContain(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //getIndexFromId
        int index = 0;
        try {
            index = getIndex(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //delete data
        todos.remove(index);

        return 0;
    }

    void cekUniqueId(Integer id) throws Exception {
        for(Todo todo : todos){
            if (todo.getId().equals(id)) throw new Exception("Id tidak dapat digunakan");
        }
    }

    void addTodo(Todo todo) throws Exception {
        Integer todosSize = todos.size();
        todos.add(todo);
        if(todosSize.equals(todos.size())) throw new Exception("gagal membuat todo");
    }
    
    void cekIsIdContain(Integer id) throws Exception {
        Boolean isUnique = false;
        for(Todo todo : todos){
            if (todo.getId().equals(id)) isUnique = true;
        }
        if (!isUnique) throw new Exception("Id tidak ditemukan");
    }

    Integer getIndex(Integer id) throws Exception {
        for (int i = 0; i < todos.toArray().length; i++) {
            Todo todo = todos.get(i);
            if (todo.getId().equals(id)) return i;
        }
        throw new Exception("gagal mendapatkan index");
    }


}

