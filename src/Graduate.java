public class Graduate implements Observer {
    private String firstName;
    private String middleName;
    private String lastName;
    private VacancyType preferredType;
    private boolean isEmployed = false;

    public Graduate(String firstName, String middleName, String lastName, VacancyType preferredType) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.preferredType = preferredType;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!isEmployed && this.preferredType == vacancy.getType()) {
            System.out.printf("Graduate %s %s %s: This vacancy at %s in %s is what I've been looking for! Vacancy: %s. Requirements: %s. Salary: %d\n",
                    firstName, middleName, lastName, vacancy.getCompanyName(), this.preferredType, vacancy.getTitle(), vacancy.getDescription(), vacancy.getSalary());
            isEmployed = true; // Обновляем статус выпускника как трудоустроенного
        }
    }
}




