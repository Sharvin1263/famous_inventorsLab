package co.grandcircus.famouslab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("home", "inventors", apiService.getTinyList());
	}

	@RequestMapping("/complete")
	public ModelAndView showComplete() {

		System.out.println(apiService.getCompleteList());

		return new ModelAndView("complete", "innovation", apiService.getCompleteList());
	}

}
