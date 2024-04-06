public class Student implements Observer {
    private String firstName, middleName, lastName;
    private int desiredSalary;
    private boolean isEmployed = false;

    public Student(String firstName, String middleName, String lastName, int desiredSalary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.desiredSalary = desiredSalary;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!isEmployed && this.desiredSalary <= vacancy.getSalary()) {
            // Выводим название компании и заработную плату
            System.out.printf("Student %s %s %s: This job is what I need! Vacancy: %s at %s. Job requirements: %s. Salary: %d\n",
                    firstName, middleName, lastName, vacancy.getTitle(), vacancy.getCompanyName(), vacancy.getDescription(), vacancy.getSalary());
            isEmployed = true; // Обновляем статус на 'трудоустроенный'
        }
    }
}



