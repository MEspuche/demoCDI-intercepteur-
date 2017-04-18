package service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import dao.IDao;

public class ServiceImpl implements IService {

	@Inject
	private IDao dao;
	
	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return dao.appelDao();
	}
	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("apres creation service");
	}

	@PreDestroy
	public void logAvantDestruction()
	{
		System.out.println("avant destruction service");
	}
}

