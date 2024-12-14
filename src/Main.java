public class Main {
    public static void main(String[] args) {
        ServiceTodo service = new ServiceTodo();

        service.create(new Todo(1,"makan","sore ini makan","01-2020"));
    }
}
