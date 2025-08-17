interface Notification {
    void send(String msg);
}

class Email1 implements Notification {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SMS implements Notification {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}

public class OpenAndClose {
    public static void main(String[] args) {
        Notification n1 = new Email1();
        Notification n2 = new SMS();

        n1.send("Hello");
        n2.send("Hi");
    }
}


// Email: Hello
// SMS: Hi