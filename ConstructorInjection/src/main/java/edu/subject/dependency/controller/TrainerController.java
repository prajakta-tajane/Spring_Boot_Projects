package edu.subject.dependency.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.subject.dependency.entity.Trainer;


@RestController
public class TrainerController 
{
	private Trainer trainerr;

	public TrainerController(Trainer trainerr) {
		super();
		this.trainerr = trainerr;
	}
	
	@GetMapping("/teaching")
	public String teach()
	{
		trainerr.teach();
		
		return "Training completed sucessfully!";
	}
}
