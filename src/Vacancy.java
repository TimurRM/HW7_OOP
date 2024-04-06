public class Vacancy {
    private String title;
    private String description;
    private VacancyType type;
    private int salary;
    private String companyName;

    public Vacancy(String title, String description, VacancyType type, int salary, String companyName) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.salary = salary;
        this.companyName = companyName;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public VacancyType getType() {
        return type;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return String.format("Company: %s, Vacancy: %s (%s), Salary: %d", companyName, title, type, salary);
    }
}
