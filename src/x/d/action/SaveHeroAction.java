package x.d.action;

import com.opensymphony.xwork2.ActionSupport;

import x.d.entity.Hero;
import x.d.service.HeroService;

public class SaveHeroAction extends ActionSupport {
	
	private Hero hero;
	private HeroService heroService;
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	public HeroService getHeroService() {
		return heroService;
	}
	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("++++++++++++++++-----------------123456789");
		heroService.doCreateHero(hero);
		return SUCCESS;
	}
}
