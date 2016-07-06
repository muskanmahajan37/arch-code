package growth.mvc.demo.mapper;

import growth.mvc.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {

	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);
}
