public interface Publisher {
    void sendVacancy(Vacancy vacancy);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}

