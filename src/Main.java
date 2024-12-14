import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceTodo service = new ServiceTodo();
        Scanner scanner = new Scanner(System.in);
        ViewCli view = new ViewCli();

        Integer input = 0;
        try{
            while (!input.equals(99)){
                input = view.menu(service,scanner);
                if(input.equals(1)){
                    Todo newTodo = view.createData(scanner);
                    service.create(newTodo);
                }else if(input.equals(2)){
                    view.read(service);
                } else if (input.equals(3)) {
                    Todo updateTodo = view.updateData(scanner);
                    System.out.println(updateTodo.getId());
                    service.update(updateTodo.getId(), updateTodo.getJudul(), updateTodo.getIsiTodo(), updateTodo.getDateTime());
                } else if (input.equals(4)) {
                    Integer id = view.delete(scanner,service);
                    service.delete(id);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


//        service.create(new Todo(1,"makan","sore ini makan","01-2020"));
//        service.create(new Todo(2,"makan","sore ini makan","01-2020"));
//        service.read();
//        service.update(2,"tidur ","tidur malam","01-01-2024");
//        service.read();
//        service.delete(1);
//        service.read();

    }
}
