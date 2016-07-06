package growth.mvc.demo.service;

import growth.mvc.demo.domain.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    public City findByState(String state);
}
