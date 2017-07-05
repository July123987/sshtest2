package x.d.action;

import com.opensymphony.xwork2.ActionSupport;

import x.d.entity.Hero;
import x.d.service.HeroService;

public class RemoveHeroAction extends ActionSupport {
	private HeroService heroService;
	private Hero hero;
	public HeroService getHeroService() {
		return heroService;
	}
	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.hero = heroService.findHeroById(hero.getId());
		heroService.delete(hero);
		return SUCCESS;
	}
}
