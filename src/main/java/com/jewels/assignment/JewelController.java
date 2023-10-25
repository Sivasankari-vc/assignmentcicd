package com.jewels.assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class JewelController {
//	@RequestMapping("hello")	
//	public String hello() {
//		return "Hello World!!!";
//	}
	@Autowired
	private JewelleryService jewelleryService;

	@RequestMapping("/jewelleries")
	public List<Jewellery> getJewellery() {
		return jewelleryService.getJewellery();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/jewelleries")
	public void addJewellery(@RequestBody Jewellery jewellery) {
		jewelleryService.addJewellery(jewellery);
	}
	
	@RequestMapping("/jewelleries/{id}")
	public Optional<Jewellery> getJewellery(@PathVariable String id){
		System.out.println("Inside getJewellery");
		return jewelleryService.getJewellery(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/jewelleries/{id}")
	public void updateJewellery(@RequestBody Jewellery jewellery, @PathVariable String id) {
		System.out.println("inside updateJewellery");
		jewelleryService.updateJewellery(id, jewellery);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/jewelleries/{id}")
	public void deleteJewellery(@PathVariable String id){
		System.out.println("Inside deleteJewellery");
		jewelleryService.deleteJewellery(id);
	}

}
