package net.software.tracking.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.software.tracking.entity.Developer;
import net.software.tracking.repository.DeveloperRepository;
import net.software.tracking.service.developerService;
@Service
public class developerServiceImpl implements developerService{
private DeveloperRepository developerrepository;
	@Override
	public List<Developer> getAllDevelopers(){
		return developerrepository.findAll();
	}
	public DeveloperRepository getDeveloperrepository() {
		return developerrepository;
	}
	public void setDeveloperrepository(DeveloperRepository developerrepository) {
		this.developerrepository = developerrepository;
	}
	public developerServiceImpl(DeveloperRepository developerrepository) {
		super();
		this.developerrepository = developerrepository;
	}
	@Override
	public Developer saveDeveloper(Developer developer) {
		// TODO Auto-generated method stub
		return developerrepository.save(developer);
	}
	@Override
	public Developer getDeveloperById(Long id) {
		// TODO Auto-generated method stub
		return developerrepository.findById(id).get();
	}
	@Override
	public Developer saveDeveloperEdit(Developer Developer) {
		// TODO Auto-generated method stub
		return developerrepository.save(Developer);
	}
	@Override
	public void deleteDeveloper(Long id) {
		// TODO Auto-generated method stub
		developerrepository.deleteById(id);
	}

}
