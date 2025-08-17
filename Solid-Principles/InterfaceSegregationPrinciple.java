 

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Just printing...");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        Printer p1 = new AllInOnePrinter();
        Printer p2 = new SimplePrinter();

        p1.print();  
        p2.print();
    }
}


// Printing...
// Just printing...