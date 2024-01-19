package net.software.tracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.software.tracking.entity.Developer;
import net.software.tracking.repository.DeveloperRepository;

@SpringBootApplication
public class SoftwareDevelopersProjectContributionTrackingApplication implements CommandLineRunner{

	@Autowired
	private DeveloperRepository developerRepository;
	public static void main(String[] args) {
		SpringApplication.run(SoftwareDevelopersProjectContributionTrackingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Developer developer = new Developer((long) 23,"Ephraim","Gethi","Java Software Developer",30,"Building of the  "
//				+ "backend and offering fronted support to all the built apps features");
//		developerRepository.save(developer);
//		Developer developer1 = new Developer((long) 24,"Deborarah","Wathayu","Php Software Developer",31,"Building of the  "
//				+ "backend and offering fronted support to all the built apps features");
//		developerRepository.save(developer1);
//		Developer developer2 = new Developer((long) 28,"Nelson","Mukoro","python Software Developer",19,"Building of the  "
//				+ "backend and offering fronted support to all the built apps features");
//		developerRepository.save(developer2);
//		
	}

}
