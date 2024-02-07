package support;

public class House{
    public int numberOfWindows;
    public int numberOfStories;
    public String color;

    public static String basement = "We do have a basement";

    public House() {

    }

    public House (String color, int numberOfWindows, int numberOfStories) {
        this.color = color;
        this.numberOfWindows = numberOfWindows;
        this.numberOfStories = numberOfStories;
    }

    public static void openTheDoor() {
        System.out.println("The fron door opens ...");
    }
}
