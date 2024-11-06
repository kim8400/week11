public class AnimalPark {
    public static void main(String[] args) {
        Location location = new Location("아프리카", "초원");

        Lion lion = new Lion();
        lion.color = "golden";
        lion.setLocation(location);
        lion.roar();
        lion.eat();

        Elephant elephant = new Elephant();
        elephant.color = "gray";
        elephant.setLocation(new Location("아시아", "숲"));
        elephant.trumpet();
        elephant.trumpet(3);
        elephant.eat();

        Eagle eagle = new Eagle();
        eagle.color = "brown";
        eagle.setLocation(new Location("북아메리카", "산악 지대"));
        eagle.fly();
        eagle.eat();

        Dolphin dolphin = new Dolphin();
        dolphin.color = "blue";
        dolphin.setLocation(new Location("대서양", "바다"));
        dolphin.swim();
        dolphin.swim(20);
        dolphin.eat();
    }
}

class Location {
    String continent;
    String habitat;

    Location(String continent, String habitat) {
        this.continent = continent;
        this.habitat = habitat;
    }
}

class Animal {
    String color;
    Location location;

    void setLocation(Location location) {
        this.location = location;
        System.out.println("위치는 " + location.continent + "의 " + location.habitat + "입니다.");
    }

    void eat() {
        System.out.println("동물이 음식을 먹습니다.");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("사자가 포효합니다!");
    }

    @Override
    void eat() {
        System.out.println("사자가 고기를 먹습니다.");
    }
}

class Elephant extends Animal {
    void trumpet() {
        System.out.println("코끼리가 큰 소리를 냅니다!");
    }

    void trumpet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("코끼리가 큰 소리를 냅니다!");
        }
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

    void swim(int speed) {
        System.out.println("돌고래가 시속 " + speed + "km로 헤엄칩니다!");
    }
}