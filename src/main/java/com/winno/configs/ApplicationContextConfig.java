package com.winno.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScans({@ComponentScan(value = "com.winno.*")})
public class ApplicationContextConfig {
	
	@Bean("viewResolver") // Bean is an object
 	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver views = new InternalResourceViewResolver();
		views.setPrefix("/WEB-INF/views/"); //folder nằm ở đâu
		views.setSuffix(".jsp");    
			
		
		return views;
	}
	

	
}
