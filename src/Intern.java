public class Intern implements Observer {
    private String firstName, middleName, lastName;
    private int maxDesiredSalary;
    private boolean isEmployed = false;

    public Intern(String firstName, String middleName, String lastName, int maxDesiredSalary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.maxDesiredSalary = maxDesiredSalary;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!isEmployed && vacancy.getSalary() <= maxDesiredSalary) {
            // Выводим информацию о вакансии и названии компании
            System.out.printf("Intern %s %s %s: This internship at %s is suitable for me! Vacancy: %s. Job requirements: %s. Salary: %d\n",
                    firstName, middleName, lastName, vacancy.getCompanyName(), vacancy.getTitle(), vacancy.getDescription(), vacancy.getSalary());
            isEmployed = true; // Обновляем статус на 'трудоустроенный'
        }
    }
}



