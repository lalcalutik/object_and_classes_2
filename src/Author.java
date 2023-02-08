public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return this.name.equals(author.getName()) && this.surname.equals(author.getSurname());

    }

    @Override
    public int hashCode() {
        String s = this.name + this.surname + "alksjdhalksfhg"; // добавил "соль" для уменьшения шансов коллизии
        return s.hashCode();
    }
}