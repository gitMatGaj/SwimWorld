//package full.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//
//
//@Configuration
//@ComponentScan("full")
//@ComponentScan("full.controllers")
//public class WebConfig implements WebMvcConfigurer {

//  BASIC view resolver:
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver resolver =
//				new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
//		resolver.setExposeContextBeansAsAttributes(true); return resolver;
//	}
//
//}
