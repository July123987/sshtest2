package x.d.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import x.d.dao.HeroDao;
import x.d.entity.Hero;

public class HeroDaoImpl extends HibernateDaoSupport implements HeroDao {

	@Override
	public void doCreateHero(Hero hero) {
		// TODO Auto-generated method stub
		//Hero hero = new Hero();
		this.getHibernateTemplate().save(hero);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hero> findAllHeros() {
		// TODO Auto-generated method stub
		String hql = "from Hero u order by u.id asc";
		List<Hero> list = (List<Hero>) this.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public void removeHero(Hero hero) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(hero);
	}

	@Override
	public void updateHero(Hero hero) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(hero);
	}

	@Override
	public Hero findHeroById(int id) {
		// TODO Auto-generated method stub
		Hero hero = null;
		hero = this.getHibernateTemplate().get(Hero.class, id);
		return hero;
	}

}
