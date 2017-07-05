package x.d.dao;

import java.util.List;

import x.d.entity.Hero;

public interface HeroDao {
	public void doCreateHero(Hero hero);
	public List<Hero> findAllHeros();
	public void removeHero(Hero hero);
	public void updateHero(Hero hero);
	public Hero findHeroById(int id);
}
