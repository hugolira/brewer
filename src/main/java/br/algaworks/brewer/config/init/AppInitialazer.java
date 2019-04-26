package br.algaworks.brewer.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.algaworks.brewer.config.JPAConfig;
import br.algaworks.brewer.config.ServiceConfig;
import br.algaworks.brewer.config.WebConfig;

public class AppInitialazer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class<?>[] {JPAConfig.class, ServiceConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}

}
