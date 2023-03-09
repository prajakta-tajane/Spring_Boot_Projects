package edu.subject.dependency.entity;

public class Trainer 
{
	
	private Subject subject;

// Generate Getter's and Setter's method
	public Subject getSubject() 
	{
		return subject;
	}

	public void setSubject(Subject subject) 
	{
		this.subject = subject;
	}
	
	
// Generate Constructor from Field's
	public Trainer(Subject subject) 
	{
		super();
		this.subject = subject;
	}

// Generate Constructors from Superclass	
	public Trainer() 
	{
		super();
	}

// Generate toString()method
 	@Override
	public String toString() 
 	{
		return "Trainer [subject=" + subject + "]";
	}

	public void teach ()
	{
		System.out.println("Trainer teaching the  "+ subject.getName());
	}
}
