package academy.mindswap;

public enum DepartmentENUM {
    ACCOUNT("Account"),
    PRODUCTION("Production"),
    PACKAGING("Packaging"),
    SALES("Sales");

    private String description;

    DepartmentENUM(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}