import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class JobAgency implements Publisher {
    private Collection<Observer> observers = new ArrayList<>();
    private List<Vacancy> vacancies = new ArrayList<>();

    @Override
    public void sendVacancy(Vacancy vacancy) {
        vacancies.add(vacancy); // Добавляем вакансию в список при отправке
        for (Observer observer : observers) {
            observer.receiveOffer(vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Collection<Observer> getObservers() {
        return observers;
    }

    public List<Vacancy> getAvailableVacancies() {
        return vacancies;
    }
}



