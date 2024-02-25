package homework_8;

import java.util.List;
import java.util.stream.Collectors;

public class SubscriberServiceImpl implements SubscriberService {
    private List<Subscriber> subscribers;

    public SubscriberServiceImpl(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public List<Subscriber> getSubscribersWithCityCallDurationExceeding(int duration) {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getCityCallDuration() > duration)
                .collect(Collectors.toList());
    }

    @Override
    public List<Subscriber> getSubscribersWithInterCityCalls() {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getInterCityCallDuration() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Subscriber> getSubscribersByLastNameInitial(char initial) {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getLastName().charAt(0) == initial)
                .collect(Collectors.toList());
    }

    @Override
    public double getTotalInternetTrafficForCity(String city) {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getCity().equalsIgnoreCase(city))
                .mapToDouble(Subscriber::getInternetTraffic)
                .sum();
    }

    @Override
    public long getCountOfSubscribersWithNegativeBalance() {
        return subscribers.stream()
                .filter(subscriber -> subscriber.getBalance() < 0)
                .count();
    }
}
