package week_14.assignments.Question_14_20;

public class Question_14_20 {
    public static void main(String[] args) {

        Post post1 = new Post();
        Post post2 = new Post();
        post1.addTag("java");
        post1.addTag("Coding");
        post1.addTag("Programing");
        post2.addTag("java");
        post2.addTag("Coding");
        post2.addTag("Technology");
        post2.addTag("Cucumber");
        System.out.println("\nBefore removing Cucumber ");
        System.out.println("Tags for Post 2: " + post2);
        System.out.println("\nAfter removing Cucumber ");
        post2.removeTag("Cucumber");
        System.out.println("Tags for Post 2: " + post2);
        System.out.println("\nTags for Post 1: " + post1);
        System.out.println("Tags for Post 2: " + post2);
        System.out.println("\nDoes post1 have the tag 'java'?  " + post1.isContains("java"));
        System.out.println("Does post2 have the tag 'Technology'?  " + post2.isContains("Technology"));
    }
}
