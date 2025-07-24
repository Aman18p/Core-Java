// Generic Interface
interface Student<I, R, S> {
    I getId();
    R getRollNumber();
    S getSection();
}

// Generic Implementation Class
class StudentImpl<I, R, S> implements Student<I, R, S> {
    private I id;
    private R rollnumber;
    private S section;

    public StudentImpl(I id, R rollnumber, S section) {
        this.id = id;
        this.rollnumber = rollnumber;
        this.section = section;
    }

    public I getId() {
        return id;
    }

    public R getRollNumber() {
        return rollnumber;
    }

    public S getSection() {
        return section;
    }
}

public class genericsInterface {
    public static void main(String[] args) {
        Student<Integer, Integer, String> st1 = new StudentImpl<>(1, 101, "Shivaji");
        Student<Integer, Integer, String> st2 = new StudentImpl<>(2, 102, "Ashoka");

        System.out.println("ID: " + st1.getId());
        System.out.println("Roll Number: " + st1.getRollNumber());
        System.out.println("Section: " + st1.getSection());
    }
}
