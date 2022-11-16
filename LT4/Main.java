class Animal {
    public void sound() {
        System.out.println("Animal sounds");
    }
}

class Chicken extends Animal {
    public void sound() {
        System.out.println("Toktoro-ok");
    }
}

class Pig extends Animal {
    public void sound() {
        System.out.println("Oink oink");
    }
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Rorororor");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Chicken c = new Chicken();
        Pig p = new Pig();
        Lion l = new Lion();

        a.sound();
        c.sound();
        p.sound();
        l.sound();
    }
}
