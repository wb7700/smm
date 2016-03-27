package com.x7700.smm.commons.environment;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.FileNotFoundException;
import java.net.URL;
import org.slf4j.LoggerFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.util.SystemPropertyUtils;

public class LogConfigurerSupportMultiEnvironment {
	public static void registLogConfiguration(String logConfigLocation) throws FileNotFoundException, JoranException {
		String resolvedLocation = SystemPropertyUtils.resolvePlaceholders(logConfigLocation);
		if (resolvedLocation.toLowerCase().endsWith(".xml")) {
			URL url = ResourceUtils.getURL(resolvedLocation);
			LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
			loggerContext.reset();
			JoranConfigurator joranConfigurator = new JoranConfigurator();
			joranConfigurator.setContext(loggerContext);
			joranConfigurator.doConfigure(url);
		}
	}
}
