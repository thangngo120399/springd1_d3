package com.winno.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;


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
	

    @Bean(name = "viewResolverTiles")
    public ViewResolver getViewResolverTitles(){
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
        viewResolver.setViewClass(TilesView.class);
        viewResolver.setOrder(0);
        return viewResolver;
    }


    @Bean(name = "tilesConfigurer")
    public TilesConfigurer getTilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions("/templates/tiles-news.xml");
        return tilesConfigurer;
    }
	
}
