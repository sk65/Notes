package Collections.ComparatorExample;

public class User implements Comparable<User> {

    String name;
    int age;
    boolean isMarried;

    public User(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return
                "nam e = " + name + '\'' +
                        ", age = " + age +
                        ", isMarried = " + isMarried;
    }

    @Override
    public int compareTo(User user) {
        return this.age - user.age;
    }

    @Override
    public int hashCode() {
        return (name.length() + age) * 32;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        if (this.hashCode() != user.hashCode()) return false;
        if (user.age == this.age
                && user.isMarried == this.isMarried
                && user.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}
