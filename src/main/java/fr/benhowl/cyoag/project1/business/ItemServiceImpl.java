package fr.benhowl.cyoag.project1.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.benhowl.cyoag.project1.dao.ItemDao;
import fr.benhowl.cyoag.project1.entity.Item;
	
	@Service
	@Transactional
	public class ItemServiceImpl implements ItemService {

		@Autowired
		ItemDao itemDao;
			
		@Override
		public Item saveInBase(Item item) {
			return itemDao.save(item);
		}

}
