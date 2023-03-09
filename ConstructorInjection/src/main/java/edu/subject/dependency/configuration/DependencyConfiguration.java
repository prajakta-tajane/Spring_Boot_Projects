package edu.subject.dependency.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.subject.dependency.entity.Subject;
import edu.subject.dependency.entity.Trainer;

@Configuration
public class DependencyConfiguration {
	
	@Bean
	public Subject subject ()
	{
       return new Subject ("Computer"); 
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer (subject());
    }	
}