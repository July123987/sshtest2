package x.d.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import x.d.entity.Hero;
import x.d.service.HeroService;

public class FindAllHerosAction extends ActionSupport {
	
	private HeroService heroService;

	public HeroService getHeroService() {
		return heroService;
	}

	public void setHeroService(HeroService heroService) {
		this.heroService = heroService;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//List<Hero> list = heroService.findAllHeros();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("list", this.heroService.findAllHeros());
		return SUCCESS;
	}
}
