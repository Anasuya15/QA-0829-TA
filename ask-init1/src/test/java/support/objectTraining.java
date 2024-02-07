package support;

public class objectTraining {
    public static void main(String[] args) {
        House house = new House();
        house.color = "red";
        house.numberOfStories = 2;
        house.numberOfWindows = 8;
        System.out.println(house.color);

        House house2 = new House("blue", 5, 2);
        System.out.println(house2.color);

        System.out.println(House.basement);

        House.openTheDoor();

    }
    }

