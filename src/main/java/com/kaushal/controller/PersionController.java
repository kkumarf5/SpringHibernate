package com.kaushal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kaushal.entity.Persion;
import com.kaushal.service.PersionService;

@Controller
public class PersionController {

	private PersionService persionService;
	
	public PersionService getPersionService() {
		return persionService;
	}

	@Autowired
	@Qualifier(value="persionService")
	public void setPersionService(PersionService persionService) {
		this.persionService = persionService;
	}



	@RequestMapping(value = "/persion", method= RequestMethod.GET  )
	public void addPersion()
	{
		Persion persion = new Persion();
		persion.setName("Avinash");
		persion.setCountry("India");
		
		this.persionService.savePersion(persion);
	}
	
	@RequestMapping(value = "/persion/fetch",method = RequestMethod.GET)
	public void fetchPersion()
	{
		List<Persion> list=this.persionService.fetchPersion();
		list.forEach(val -> System.out.println("fetched val :"+val.getName()));
	}
	
	@RequestMapping(value = "/persion/update", method= RequestMethod.GET  )
	public void update()
	{
		Persion persion = new Persion();
		persion=this.persionService.getPersionById(1);
		persion.setName("Sandeep");
		this.persionService.updatePersion(persion);
	}
	
	@RequestMapping(value = "/persion/remove", method= RequestMethod.GET  )
	public void remove()
	{
		this.persionService.removePersion(1);
	}
}
