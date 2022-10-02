package Homework_13;

public class Author {
    private String lastName;
    private String name;

    public Author(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + this.lastName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return lastName.equals(author.lastName);

}
}

