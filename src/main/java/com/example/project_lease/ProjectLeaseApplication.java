package com.example.project_lease;

import com.example.project_lease.model.Product;
import com.example.project_lease.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectLeaseApplication implements CommandLineRunner {

    private ProductRepository productRepository;
    private Logger LOG = LoggerFactory.getLogger(ProjectLeaseApplication.class);

    @Autowired
    public void productRepository(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjectLeaseApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Product product1 = new Product();
        product1.setCategory("Human");
        product1.setName("Adonias");
        product1.setSector("Banking");
        product1.setType("Male");

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setCategory("Human");
        product2.setName("Sara");
        product2.setSector("Educational");
        product2.setType("Female");

        productRepository.save(product2);


        Product product3 = new Product();
        product3.setCategory("Robot");
        product3.setName("Alita");
        product3.setSector("AI");
        product3.setType("FemaleRobot");

        productRepository.save(product3);

//

//        Product product = productRepository.findByType("Male");
//        LOG.info("This product is by find_by_type method." + product.toString());
//
//        List<Product> results = productRepository.findByCategory("Human");
//
//        for (Product other_product:results){
//            LOG.info("another product by find_by_type_category method." + other_product.toString());
//        }

//        Product product = productRepository.findByType("FemaleRobot");
//
//        if (product != null){
//            LOG.info("DB count before Deletion:" + productRepository.count());
//            productRepository.delete(product);
//            LOG.info("DB count After Deletion:" + productRepository.count());
//        }else {
//            LOG.info("Please change your method parameter!!!");
//        }


//        Product productToBeUpdated = productRepository.findByName("Alita");
//
//        if (productToBeUpdated != null){
//
//            LOG.info("The entity before updating:" + productToBeUpdated.toString());
//
//            productToBeUpdated.setName("Alita-2");
//            productToBeUpdated.setSector("Advanced_AI");
//
//            Product updated = productRepository.save(productToBeUpdated);
//            LOG.info("After updating the details:" + updated.toString());
//        }


    }



}
