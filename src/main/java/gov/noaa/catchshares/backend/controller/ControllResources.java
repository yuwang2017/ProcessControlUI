package gov.noaa.catchshares.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ui")
public class ControllResources {
	 /**
     * GET HMS Users
     */
    @GetMapping("/home")
    @ResponseBody
    public String getHomePage() {
    	return "home";
    }
}
