package homework_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(new Subscriber(1, "Ivanov", "Ivan", "Kyiv", "123-4567", "C001", 50.0, 120, 30, 10.5));
        subscribers.add(new Subscriber(2, "Petrov", "Petr", "Lviv", "234-5678", "C002", -10.0, 50, 0, 15.2));
        subscribers.add(new Subscriber(3, "Sidorov", "Sidor", "Kyiv", "345-6789", "C003", 25.0, 70, 45, 5.7));
        subscribers.add(new Subscriber(4, "Ivanenko", "Ivanka", "Odesa", "456-7890", "C004", -5.0, 20, 60, 12.3));
        subscribers.add(new Subscriber(5, "Ostapenko", "Ostap", "Kyiv", "567-8901", "C005", 100.0, 10, 20, 20.5));

        SubscriberService service = new SubscriberServiceImpl(subscribers);

        System.out.println("Subscribers with city call duration exceeding 60 minutes:");
        service.getSubscribersWithCityCallDurationExceeding(60).forEach(System.out::println);

        System.out.println("\nSubscribers with intercity calls:");
        service.getSubscribersWithInterCityCalls().forEach(System.out::println);

        System.out.println("\nSubscribers with last name starting with 'I':");
        service.getSubscribersByLastNameInitial('I').forEach(System.out::println);

        System.out.println("\nTotal internet traffic for Kyiv:");
        System.out.println(service.getTotalInternetTrafficForCity("Kyiv"));

        System.out.println("\nCount of subscribers with negative balance:");
        System.out.println(service.getCountOfSubscribersWithNegativeBalance());
    }
}
