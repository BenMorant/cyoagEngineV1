package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.benhowl.cyoag.project1.dao.InventoryDao;
import fr.benhowl.cyoag.project1.entity.Inventory;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	InventoryDao inventoryDao;
		
	@Override
	public Inventory saveInBase(Inventory inventory) {
		return inventoryDao.save(inventory);
	}

}
