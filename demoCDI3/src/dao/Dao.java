package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao implements IDao {

	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour je suis bien dans la DAO";
	}
	
	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("apres creation dao");
	}

	@PreDestroy
	public void logAvantDestruction()
	{
		System.out.println("avant destruction dao");
	}
}
