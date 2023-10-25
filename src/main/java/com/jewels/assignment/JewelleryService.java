package com.jewels.assignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JewelleryService {
	@Autowired
	private JewelleryDAORepository jewelleryDAORepository;
	
	public List<Jewellery> getJewellery(){
		List<Jewellery> jewelleryList = new ArrayList<Jewellery>();
		jewelleryDAORepository.findAll().forEach(jewelleryList::add);
		return jewelleryList;
		}
	
	public Optional<Jewellery> getJewellery(String id) {
		return jewelleryDAORepository.findById(id);
	}
	
	public void updateJewellery(String id, Jewellery jewellery) {
		jewelleryDAORepository.save(jewellery);
	}

	public void deleteJewellery(String id) {
		jewelleryDAORepository.deleteById(id);
	}

	public void addJewellery(Jewellery jewellery) {
		jewelleryDAORepository.save(jewellery);
	}
}
