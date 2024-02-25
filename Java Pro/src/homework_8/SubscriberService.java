package homework_8;

import java.util.List;

public interface SubscriberService {
    List<Subscriber> getSubscribersWithCityCallDurationExceeding(int duration);
    List<Subscriber> getSubscribersWithInterCityCalls();
    List<Subscriber> getSubscribersByLastNameInitial(char initial);
    double getTotalInternetTrafficForCity(String city);
    long getCountOfSubscribersWithNegativeBalance();
}
