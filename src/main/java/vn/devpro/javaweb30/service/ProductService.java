package vn.devpro.javaweb30.service;

import org.springframework.stereotype.Service;

import vn.devpro.javaweb30.model.Product;

@Service
public class ProductService extends BaseService<Product> {

	@Override
	public Class<Product> clazz() {
		// TODO Auto-generated method stub
		return Product.class;
	}

}
