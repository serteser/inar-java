package week_14.assignments.Question_14_20;

import java.util.HashSet;
import java.util.Set;

public class Post {
    private Set<String> post;

    public Post() {

        post = new HashSet<>();

    }

    public void addTag(String tag) {

        post.add(tag);
    }

    public void removeTag(String tag) {

        post.remove(tag);
    }

    public boolean isContains(String tag) {

        return post.contains(tag);
    }
    @Override
    public String toString(){

       return post.toString();
    }

}
