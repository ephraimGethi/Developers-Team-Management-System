package net.software.tracking.service;
import java.util.List;

import net.software.tracking.entity.*;
public interface developerService {
	List<Developer> getAllDevelopers();
	Developer  saveDeveloper(Developer developer);
	Developer getDeveloperById(Long id);
	Developer saveDeveloperEdit(Developer Developer);
	void deleteDeveloper(Long id);
	

}
