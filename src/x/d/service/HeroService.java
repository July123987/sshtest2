package x.d.service;

import java.util.List;

import x.d.entity.Hero;

public interface HeroService {
	public void doCreateHero(Hero hero);
	public List<Hero> findAllHeros();
	public void delete(Hero hero);
	public void update(Hero hero);
	public Hero findHeroById(int id);
}
