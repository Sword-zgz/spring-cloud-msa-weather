package com.syy.spring.cloud.weather.service;

import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
* @author 作者：Sword E-mail:
* @version 创建时间：2018年11月8日 上午10:38:25
* 类说明
*/
public interface WeatherDataService {
	// 根据城市id获取天气数据
	WeatherResponse getDataByCityId(String cityId);
	
	// 根据城市获取天气数据
	WeatherResponse getDataByCityName(String cityName);
	
}
