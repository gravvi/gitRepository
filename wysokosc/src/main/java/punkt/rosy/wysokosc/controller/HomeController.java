package punkt.rosy.wysokosc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import punkt.rosy.wysokosc.oblicz.Oblicz;
import punkt.rosy.wysokosc.oblicz.Oblicz33;
import punkt.rosy.wysokosc.servis.Servis;

@Controller
public class HomeController {


	@Autowired
	private Oblicz oblicz2;
	
	@Autowired
	private Oblicz33 oblicz33;

	@Autowired
	Servis servis;

	

	@RequestMapping(value="/")
	public ModelAndView test(ModelAndView mav) throws IOException{
		mav.addObject("dane", servis.Servis());
		mav.addObject("opis", " wysokosc podstawy chmur wynosi: ");
		mav.setViewName("home");
		return mav;
	}
}
