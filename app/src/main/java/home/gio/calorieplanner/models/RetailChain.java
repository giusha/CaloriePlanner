package home.gio.calorieplanner.models;


import java.io.Serializable;
import java.util.List;


public class RetailChain implements Serializable{
    private String name;
    private List<Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
