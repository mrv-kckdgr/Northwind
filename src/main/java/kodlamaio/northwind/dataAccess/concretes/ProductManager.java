package kodlamaio.northwind.dataAccess.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productDao;

	@Autowired  //spring arka planda dao instance oluşturur
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		//all data
		return this.productDao.findAll();
	}

}
