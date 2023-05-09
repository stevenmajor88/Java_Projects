public class MadLibs {
    /*
     * This program generates a mad libbed story.
     * Author: Steven Nguyen
     * Date 05/07/2023
     */
    public static void main(String[] args) {

        String name1 = "Steven";
        String adjective1 = "wonderful";
        String adjective2 = "happy";
        String adjective3 = "gleeful";
        String verb1 = "run";
        String noun1 = "dog";
        String noun2 = "dog";
        String noun3 = "cat";
        String noun4 = "banana";
        String noun5 = "chocolate";
        String noun6 = "vanilla";

        String name2 = "James";
        int number = 8;
        String place1 = "Texas";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep ";

        System.out.println(story);
    }
}
