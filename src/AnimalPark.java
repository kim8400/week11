public class AnimalPark {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.color = "golden";
        lion.roar();
        lion.eat();

        Elephant elephant = new Elephant();
        elephant.color = "gray";
        elephant.trumpet();
        elephant.eat();

        Eagle eagle = new Eagle();
        eagle.color = "brown";
        eagle.fly();
        eagle.eat();

        Dolphin dolphin = new Dolphin();
        dolphin.color = "blue";
        dolphin.swim();
        dolphin.eat();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("동물이 음식을 먹습니다.");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("사자가 포효합니다!");
    }
}

class Elephant extends Animal {
    void trumpet() {
        System.out.println("코끼리가 큰 소리를 냅니다!");
    }
}

class Eagle extends Animal {
    void fly() {
        System.out.println("독수리가 하늘을 납니다!");
    }
}

class Dolphin extends Animal {
    void swim() {
        System.out.println("돌고래가 바다를 헤엄칩니다!");
    }
}