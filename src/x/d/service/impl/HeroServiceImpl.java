package x.d.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import x.d.dao.HeroDao;
import x.d.entity.Hero;
import x.d.service.HeroService;

@Transactional
public class HeroServiceImpl implements HeroService {
	
	private HeroDao heroDao;
	public HeroDao getHeroDao() {
		return heroDao;
	}

	public void setHeroDao(HeroDao heroDao) {
		this.heroDao = heroDao;
	}

	@Override
	public void doCreateHero(Hero hero) {
		// TODO Auto-generated method stub
		this.heroDao.doCreateHero(hero);
	}

	@Override
	public List<Hero> findAllHeros() {
		// TODO Auto-generated method stub
		return this.heroDao.findAllHeros();
	}

	@Override
	public void delete(Hero hero) {
		// TODO Auto-generated method stub
		this.heroDao.removeHero(hero);
	}

	@Override
	public void update(Hero hero) {
		// TODO Auto-generated method stub
		this.heroDao.updateHero(hero);
	}

	@Override
	public Hero findHeroById(int id) {
		// TODO Auto-generated method stub
		return this.heroDao.findHeroById(id);
	}
	
}
