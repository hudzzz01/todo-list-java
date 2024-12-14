import java.util.Scanner;

public class ViewCli{

    Integer menu(ServiceTodo service, Scanner scanner){

        System.out.println("----------- Selamat Datang di program Crud Todo List Hudzaifah");
        read(service);
        System.out.println("silakah pilih menu yang anda inginkan");
        System.out.println("1. Create todo");
        System.out.println("2. Read todo");
        System.out.println("3. Update todo");
        System.out.println("4. Delete todo");
        System.out.println("99. keluar");
        System.out.println("-------------------------------------");
        System.out.println("Masukan pilihan kamu : ");
        try{
            Integer id = inputToInt(scanner);
            return id;
        }catch (Exception e){
            System.out.println("input tidak valid");
            return 0;
        }


    }

    Todo createData(Scanner scanner){
        Todo todo = new Todo();
        System.out.println("--------- Masukan id todo :");
        try{
            Integer id = inputToInt(scanner);
            todo.setId(id);
        }catch (Exception e){
            System.out.println("input tidak valid");
            return null;
        }


        System.out.println("--------- Masukan judultodo :");
        String judul = scanner.nextLine();
        todo.setJudul(judul);

        System.out.println("--------- Masukan isi todo :");
        String isi = scanner.nextLine();
        todo.setIsiTodo(isi);

        System.out.println("--------- Masukan date time todo :");
        String dateTime = scanner.nextLine();
        todo.setDateTime(dateTime);

        return todo;
    }

    void read(ServiceTodo service){
        System.out.println("isi todo list kamu sekarang adalah : ");
        service.read();
    }

    Todo updateData(Scanner scanner){
        Todo todo = new Todo();
        System.out.println("--------- Masukan id todo Baru :");
        try{
            Integer id = inputToInt(scanner);
            todo.setId(id);
        }catch (Exception e){
            System.out.println("input tidak valid");
            return null;
        }


        System.out.println("--------- Masukan judultodo Baru :");
        String judul = scanner.nextLine();
        todo.setJudul(judul);

        System.out.println("--------- Masukan isi todo  Baru:");
        String isi = scanner.nextLine();
        todo.setIsiTodo(isi);

        System.out.println("--------- Masukan date time todo Baru :");
        String dateTime = scanner.nextLine();
        todo.setDateTime(dateTime);

        return todo;
    }

    Integer delete(Scanner scanner, ServiceTodo service){
        System.out.println("Masukan id todo yang ingin kamu hapus : ");
        try{
            Integer id = inputToInt(scanner);
            return id;
        }catch (Exception e){
            System.out.println("input tidak valid");
            return 0;
        }

    }

    Integer inputToInt(Scanner scanner){
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }


}
