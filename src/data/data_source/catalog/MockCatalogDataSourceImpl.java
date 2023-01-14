package data.data_source.catalog;

import data.models.Product;

import java.util.ArrayList;

public class MockCatalogDataSourceImpl extends CatalogDataSource {
    @Override
    public ArrayList<Product> getCatalog() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Id1", "SmartPhone", "Best phone", 1000, true));
        products.add(new Product("Id2", "Laptop", "Some Laptop", 2000, true));
        products.add(new Product("Id3", "Watch", "Best watch", 500, true));
        products.add(new Product("Id4", "Phone", "Simple phone", 100, true));
        return products;
    }
}
