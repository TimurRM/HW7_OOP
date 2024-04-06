public class Master implements Observer {
    private String firstName, middleName, lastName;
    private int desiredSalary;
    private boolean isEmployed = false;

    public Master(String firstName, String middleName, String lastName, int desiredSalary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.desiredSalary = desiredSalary;
    }

    public int getDesiredSalary() {
        return desiredSalary;
    }
    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (!isEmployed && this.desiredSalary <= vacancy.getSalary()) {
            // Выводим имя компании в сообщении
            System.out.println(firstName + " " + middleName + " " + lastName +
                    " has accepted the position: " + vacancy.getTitle() +
                    " at " + vacancy.getCompanyName() + " with salary " + vacancy.getSalary() +
                    ". Job requirements: " + vacancy.getDescription());
            isEmployed = true; // Статус трудоустройства
        }
    }
}


