package ss12_java_collection_framework.exercise.arraylist_and_linkedlist_in_collection_framework.model;

public class Product {
private int id;
private String nameProduct;
private double moneyProduct;
private String producer;

    public Product() {
    }

    public Product(int id, String nameProduct, double moneyProduct, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.moneyProduct = moneyProduct;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getMoneyProduct() {
        return moneyProduct;
    }

    public void setMoneyProduct(double moneyProduct) {
        this.moneyProduct = moneyProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct = " + nameProduct +
                ", moneyProduct = " + moneyProduct +
                ", producer = " + producer ;
                };
    }


