
interface Message {
    void send();
}

class Email implements Message {
    @Override
    public void send() {
        System.out.println("Sending Email...");
    }
}

class Alert {
    public Message message;
    public Alert(Message message) {
        this.message = message;
    }
    public void notifyuser() {
        message.send();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Alert a = new Alert(new Email());  
        a.notifyuser();  
    }
}



// Sending Email...