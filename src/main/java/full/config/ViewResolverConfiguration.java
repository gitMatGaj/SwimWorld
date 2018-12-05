package full.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * Configuration contains View generation properties
 *
 * @author Mateusz Gajek
 * @version 0.9.0
 *
 */
@ComponentScan("full")
@Configuration
public class ViewResolverConfiguration implements WebMvcConfigurer {

    /**
     * Method defines Apache Tiles configuration object
     * @return Apache Tiles configuration object
     */
//    @Bean
//    public TilesConfigurer getTilesConfigurer() {
//        TilesConfigurer tilesConfigurer = new TilesConfigurer();
//
//        tilesConfigurer.setDefinitions(
//        		"/WEB-INF/layout/tiles.xml"
//        );
//
//        return tilesConfigurer;
//    }
//
//    /**
//     * Defining Apache Tiles view resolver
//     * @return Implementation of ViewResolver interface
//     */
//    @Bean
//    public ViewResolver getTilesViewResolver() {
//        return new TilesViewResolver();
//    }
    
//  // THYMELEAF:

	 @Autowired
	   private ApplicationContext applicationContext;

	   /*
	    * STEP 1 - Create SpringResourceTemplateResolver
	    * */
	   @Bean
	   public SpringResourceTemplateResolver templateResolver() {
	      SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	      templateResolver.setApplicationContext(applicationContext);
	      templateResolver.setPrefix("/WEB-INF/templates/");
	      templateResolver.setSuffix(".html");
	      templateResolver.setCharacterEncoding("UTF-8");
	      templateResolver.setTemplateMode("XHTML");
	      return templateResolver;
	   }

	   /*
	    * STEP 2 - Create SpringTemplateEngine
	    * */
	   @Bean
	   public SpringTemplateEngine templateEngine() {
	      SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	      templateEngine.setTemplateResolver(templateResolver());
	      templateEngine.setEnableSpringELCompiler(true);
	      templateEngine.addDialect(new SpringSecurityDialect());
	      return templateEngine;
	   }

	   /*
	    * STEP 3 - Register ThymeleafViewResolver
	    * */
	   @Override
	   public void configureViewResolvers(ViewResolverRegistry registry) {
	      ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	      resolver.setTemplateEngine(templateEngine());
	      resolver.setCharacterEncoding("UTF-8");
	      registry.viewResolver(resolver);
	   }

	   //		Enables view static things contains in applications resource
		@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }

}
