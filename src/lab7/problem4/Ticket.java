package lab7.problem4;
class Ticket {
    private int id;
    private String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public Ticket() {
        this.id = 0;
        this.description = "";
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket{id=" + id + ", description='" + description + "'}";
    }
}
