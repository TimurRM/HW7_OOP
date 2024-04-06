import java.util.Collection;
import java.util.List;
public class Program {

    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company smartBrains = new Company("SmartBrains", jobAgency, 300000);
        Company aiBrains = new Company("AIBrains", jobAgency, 300000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 300000);

        // Генератор имен
        String[] firstNames = {"Nathan", "David", "Philip", "Naomi", "Priscilla"};
        String[] middleNames = {"Noah", "Samuel", "Mary", "Paul", "Solomon"};
        String[] lastNames = {"Abraham", "Jonah", "Daniel", "Joseph", "Benjamin"};
        VacancyType[] vacancyTypes = {VacancyType.TECHNOLOGY, VacancyType.MARKETING, VacancyType.MANAGEMENT, VacancyType.EDUCATION, VacancyType.DEVELOPMENT, VacancyType.SALES};

        // Создаем и регистрируем различные типы соискателей
        for (int i = 0; i < firstNames.length; i++) {
            switch (i) {
                case 0:
                    Master master = new Master(firstNames[i], middleNames[i], lastNames[i], 100000);
                    jobAgency.registerObserver(master);
                    break;
                case 1:
                    Student student = new Student(firstNames[i], middleNames[i], lastNames[i], 100000);
                    jobAgency.registerObserver(student);
                    break;
                case 2:
                    PhDStudent phdStudent = new PhDStudent(firstNames[i], middleNames[i], lastNames[i], vacancyTypes[i]);
                    jobAgency.registerObserver(phdStudent);
                    break;
                case 3:
                    Intern intern = new Intern(firstNames[i], middleNames[i], lastNames[i], 50000);
                    jobAgency.registerObserver(intern);
                    break;
                case 4:
                    Graduate graduate = new Graduate(firstNames[i], middleNames[i], lastNames[i], vacancyTypes[i]);
                    jobAgency.registerObserver(graduate);
                    break;
            }
        }

        // Публикуем вакансии
        aiBrains.publishVacancy("Marketing Specialist", "Looking for a talented marketing expert", VacancyType.MARKETING, 125000);
        geekBrains.publishVacancy("Software Engineer", "Seeking a skilled software developer", VacancyType.EDUCATION, 130000);
        smartBrains.publishVacancy("Product Manager", "Searching for an experienced project leader", VacancyType.TECHNOLOGY, 155000);
        smartBrains.publishVacancy("Frontend Developer", "Seeking a frontend development professional", VacancyType.TECHNOLOGY, 155000);
        geekBrains.publishVacancy("Marketing Analyst", "Looking for an analytical marketing professional", VacancyType.MARKETING, 125000);
        aiBrains.publishVacancy("Project Manager", "Seeking an experienced project management professional", VacancyType.MANAGEMENT, 185000);
        smartBrains.publishVacancy("Instructor", "Searching for an innovative educator", VacancyType.EDUCATION, 95000);
        aiBrains.publishVacancy("Sales Manager", "Seeking a skilled sales management professional", VacancyType.SALES, 125000);
        geekBrains.publishVacancy("Product Development Manager", "Searching for an experienced product development leader", VacancyType.DEVELOPMENT, 135000);
        smartBrains.publishVacancy("Junior Software Engineer", "Seeking a junior software development professional", VacancyType.DEVELOPMENT, 155000);
        geekBrains.publishVacancy("Content Marketing Specialist", "Looking for a content marketing expert", VacancyType.MARKETING, 125000);
        aiBrains.publishVacancy("Technical Project Manager", "Seeking a technical project management professional", VacancyType.MANAGEMENT, 115000);
        smartBrains.publishVacancy("Lecturer", "Searching for an enthusiastic lecturer", VacancyType.EDUCATION, 85000);
        aiBrains.publishVacancy("Sales Manager", "Seeking an experienced sales management professional", VacancyType.SALES, 115000);
        geekBrains.publishVacancy("Development Project Manager", "Searching for an experienced development project manager", VacancyType.DEVELOPMENT, 105000);

        Collection<Vacancy> getAvailableVacancies = jobAgency.getAvailableVacancies();
        smartBrains.displayAvailableVacancies(getAvailableVacancies);
        // Можно добавить дополнительные условия и логику для определения, кого удалить

        Observer jobSeekerToRemove = jobAgency.getObservers().iterator().next(); // Здесь удаляем первого в списке
        jobAgency.removeObserver(jobSeekerToRemove);
        System.out.println("One of the job seekers has been removed after getting a job.");


        // Публикуем дополнительные вакансии после удаления
        aiBrains.publishVacancy("Marketing Specialist", "Looking for a talented marketing expert", VacancyType.MARKETING, 125000);
        geekBrains.publishVacancy("Software Engineer", "Seeking a skilled software developer", VacancyType.EDUCATION, 130000);
        smartBrains.publishVacancy("Product Manager", "Searching for an experienced project leader", VacancyType.TECHNOLOGY, 155000);
        smartBrains.publishVacancy("Frontend Developer", "Seeking a frontend development professional", VacancyType.TECHNOLOGY, 155000);
        geekBrains.publishVacancy("Marketing Analyst", "Looking for an analytical marketing professional", VacancyType.MARKETING, 125000);
        aiBrains.publishVacancy("Project Manager", "Seeking an experienced project management professional", VacancyType.MANAGEMENT, 185000);
        smartBrains.publishVacancy("Instructor", "Searching for an innovative educator", VacancyType.EDUCATION, 95000);
        aiBrains.publishVacancy("Sales Manager", "Seeking a skilled sales management professional", VacancyType.SALES, 125000);
        geekBrains.publishVacancy("Product Development Manager", "Searching for an experienced product development leader", VacancyType.DEVELOPMENT, 135000);
        smartBrains.publishVacancy("Junior Software Engineer", "Seeking a junior software development professional", VacancyType.DEVELOPMENT, 155000);
        geekBrains.publishVacancy("Content Marketing Specialist", "Looking for a content marketing expert", VacancyType.MARKETING, 125000);
        aiBrains.publishVacancy("Technical Project Manager", "Seeking a technical project management professional", VacancyType.MANAGEMENT, 115000);
        smartBrains.publishVacancy("Lecturer", "Searching for an enthusiastic lecturer", VacancyType.EDUCATION, 85000);
        aiBrains.publishVacancy("Sales Manager", "Seeking an experienced sales management professional", VacancyType.SALES, 115000);
        geekBrains.publishVacancy("Development Project Manager", "Searching for an experienced development project manager", VacancyType.DEVELOPMENT, 105000);


        List<Vacancy> availableVacancies = jobAgency.getAvailableVacancies();
        System.out.println("Available Vacancies:");
            for (Vacancy vacancy : availableVacancies) {
            System.out.println(vacancy);
        }
    }
}
