import java.util.Collection;
import java.util.Random;

public class Company {
    private Random random = new Random(System.currentTimeMillis());
    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void publishVacancy(String title, String description, VacancyType type, int maxSalary) {
        int salary = random.nextInt(maxSalary) + 50000;
        Vacancy vacancy = new Vacancy(title, description, type, salary, this.name); // Company Name - this.name
        jobAgency.sendVacancy(vacancy);
    }

    public void displayAvailableVacancies(Collection<Vacancy> vacancies) {
        System.out.println("Available Vacancies:");
        for (Vacancy vacancy : vacancies) {
            System.out.printf("Vacancy: %s at %s (%s), Salary: %d\n",
                    vacancy.getTitle(), vacancy.getCompanyName(), vacancy.getType(), vacancy.getSalary());
        }
    }
}



