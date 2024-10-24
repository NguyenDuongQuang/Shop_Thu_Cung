package vn.devpro.javaweb30.service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import vn.devpro.javaweb30.dto.Jw30Contant;
import vn.devpro.javaweb30.dto.seacrhModels;
import vn.devpro.javaweb30.model.Product;
import vn.devpro.javaweb30.model.ProductImage;

@Service
public class ProductService extends BaseService<Product> implements Jw30Contant {

	@Override
	public Class<Product> clazz() {
		return Product.class;
	}

	public List<Product> search(seacrhModels searchModel) {
		String sql = "SELECT * FROM tbl_product p WHERE 1=1";
		// Tìm theo status
		if (searchModel.getStatus() != 2) {
			sql += " AND p.status=" + searchModel.getStatus();
		}
		
		//TÌm theo category
		if (searchModel.getCategoryId() != 0) {
			sql += " AND p.category_id=" + searchModel.getCategoryId();
		}
		//Tìm theo keyword
		String keyword = searchModel.getKeyword();
		if(keyword != null) {
			sql += " AND (LOWER(p.name) like '%" + keyword + "%')"
					+ " OR (LOWER(p.short_description) like '%" + keyword + "%')";
		}
		//Tìm từ ngày đến ngày
		String date1 = searchModel.getBeginDate();
		String date2 = searchModel.getEndDate();
		if (date1 != null && date2 != null) {
			sql += " AND p.create_date BETWEEN '" + date1 + "' AND '" + date2 + "'";
		}
		System.out.println(sql);
		
		return super.executeNativeSql(sql);
	}

	public boolean isExistFile(MultipartFile file) {
		if (file != null && !StringUtils.isEmpty(file.getOriginalFilename())) {
			return true;
		}
		return false;
	}

	public boolean isExistFiles(MultipartFile[] files) {
		if (files != null && files.length > 0) {
			return true;
		}
		return false;
	}

	@Transactional
	public Product saveProduct(Product product, MultipartFile avatarFile, MultipartFile[] imageFiles)
			throws IOException {
		// Kiểm tra xem có upload avatar không?
		if (isExistFile(avatarFile)) {// có upload
			// Lưu file vào thư mục Product/Avatar
			String path = FOLDER_UPLOAD + "Product/Avatar/" + avatarFile.getOriginalFilename();

			File file = new File(path);
			avatarFile.transferTo(file);

			// Lưu đường dẫn vào DB
			product.setAvatar("Product/Avatar/" + avatarFile.getOriginalFilename());
		}

		// Kiểm tra xem có upload images không?
		if (isExistFiles(imageFiles)) {// Có upload
			for (MultipartFile image : imageFiles) {
				if (isExistFile(image)) {
					// Lưu file vào thư muc
					String path = FOLDER_UPLOAD + "Product/Avatar/" + image.getOriginalFilename();

					File file = new File(path);
					image.transferTo(file);
					// Lưu đường dẫn vào bản tbl_product_image
					ProductImage productImage = new ProductImage();
					productImage.setPath("Product/Avatar/" + image.getOriginalFilename());
					productImage.setTitle(image.getOriginalFilename());
					productImage.setCreateDate(new Date());
					productImage.setStatus(true);

					productImage.setProduct(product);
					product.addRelationalProductImage(productImage);
				}
			}
		}
		if (product.getPrice() == null) {
			product.setPrice(BigDecimal.ZERO);
		}
		if (product.getSalePrice() == null) {
			product.setSalePrice(BigDecimal.ZERO);
		}
		return saveOrUpdate(product);
	}

	@Transactional
	public Product saveEditProduct(Product product, MultipartFile avatarFile, MultipartFile[] imageFiles)
			throws IOException {
		// Kiểm tra xem có upload avatar không?
		if (isExistFile(avatarFile)) {// có upload
			// Kiểm tra xem có avatar cũ không
			if (product.getAvatar() != null && !StringUtils.isEmpty(product.getAvatar())) {
				// Có thì phải xóa avatar cũ
				String path = FOLDER_UPLOAD + product.getAvatar();
				File file = new File(path);
				file.delete();
			}
			// Lưu file mới
			product.setAvatar("Product/Avatar/" + avatarFile.getOriginalFilename());
			String path = FOLDER_UPLOAD + "Product/Avatar/" + avatarFile.getOriginalFilename();

			File file = new File(path);
			avatarFile.transferTo(file);
		}

		// Kiểm tra xem có upload images không?
		if (isExistFiles(imageFiles)) {// Có upload
			for (MultipartFile image : imageFiles) {
				if (isExistFile(image)) {
					// Lưu file vào thư muc
					String path = FOLDER_UPLOAD + "Product/Avatar/" + image.getOriginalFilename();

					File file = new File(path);
					image.transferTo(file);
					// Lưu đường dẫn vào bản tbl_product_image
					ProductImage productImage = new ProductImage();
					productImage.setPath("Product/Avatar/" + image.getOriginalFilename());
					productImage.setTitle(image.getOriginalFilename());
					productImage.setCreateDate(new Date());
					productImage.setStatus(true);

					productImage.setProduct(product);
					product.addRelationalProductImage(productImage);
				}
			}
		}
		if (product.getPrice() == null) {
			product.setPrice(BigDecimal.ZERO);
		}
		if (product.getSalePrice() == null) {
			product.setSalePrice(BigDecimal.ZERO);
		}
		return saveOrUpdate(product);
	}

}
