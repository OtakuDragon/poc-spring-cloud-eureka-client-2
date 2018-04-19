package br.com.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocRestController {

	@RequestMapping(method=RequestMethod.GET, value = "/api")
    public String service() {
        return "Service Data";
    }
	
	
}
