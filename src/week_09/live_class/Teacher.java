package week_09.live_class;

public class Teacher {
    String name;

    String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
