public class Student {
    private static int count = 0;
    private final  int id;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.id = count;
        count++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
