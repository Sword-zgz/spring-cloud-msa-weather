package com.syy.spring.cloud.weather.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
* @author 作者：Sword E-mail:
* @version 创建时间：2018年3月21日 上午10:18:25
* 类说明
*/
@FeignClient("MSA-WEATHER-CITY-EUREKA")
public interface CityClient {
	
	@GetMapping("/cities")
	String cityLists();
}
