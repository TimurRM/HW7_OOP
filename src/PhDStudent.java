public class PhDStudent implements Observer {
    private String firstName, middleName, lastName;
    private VacancyType interestedInType;
    private boolean isEmployed = false;

    public PhDStudent(String firstName, String middleName, String lastName, VacancyType interestedInType) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.interestedInType = interestedInType;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!isEmployed && this.interestedInType == vacancy.getType()) {
            System.out.printf("PhD Student %s %s %s: This vacancy at %s in %s is perfect for me! Vacancy: %s. Job descriptions: %s. Salary: %d\n",
                    firstName, middleName, lastName, vacancy.getCompanyName(), interestedInType, vacancy.getTitle(), vacancy.getDescription(), vacancy.getSalary());
            isEmployed = true; // Обновляем статус на 'трудоустроенный'
        }
    }
}


