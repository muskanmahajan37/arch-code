package growth.mvc.demo.service.impl;

import growth.mvc.demo.domain.City;
import growth.mvc.demo.mapper.CityMapper;
import growth.mvc.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

public class CityImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    public City findByState(String state) {
        return cityMapper.findByState(state);
    }
}
