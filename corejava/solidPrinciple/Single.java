package corejava.solidPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Single {
    class Product{
        String name;
        double price;
        Product(String n, double p){
            name = n;
            price = p;
        }
    }

//     🧨 Problem in ShoppingCart:
// It does too many things:
// Manages products.
// May include pricing, discounts, billing, or saving logic (not shown here but commonly added).
//So it's violating SRP because one class is doing multiple jobs.
   
//This breaks Single responsibility principle -------------------
    class ShoppingCart{
        List<Product> products = new ArrayList<>();
        public void addProduct(Product p){
            products.add(p);
        }
        public List<Product> getProducts(){
           return products;
        }
        public double calculateTotal(){
            double total = 0;
            for(Product p:products){
                total += p.price;
            }
            return total;
        }
        public void printInvoice(){
            for(Product p: products){
                System.out.println(p.name+" - "+p.price);
            }
            System.out.println("Total "+ calculateTotal());
        }
    }


    //So we should follow Single responsibility Principle 
    //"A class should hv only one single reason to change"


// It is not necessary that a class should have only one method, it can hv multiple
// but their responsibility should be same like 
// shopingCart1 has responsibilty about product 
// InvoiceCalculater has responsibilty to calculate total
// InvoicePrinter has responsibilty to print
//  
    class ShoppingCart1{
        List<Product> products = new ArrayList<>();
        public void addProduct(Product p){
            products.add(p);
        }
        public List<Product> getProducts(){
            return products;
        }

    }

    class InvoiceCalculater{
        public double calculateTotal(List<Product> products){
            double total = 0;

            for(Product p:products){
                total += p.price;
            }
            return total;
        }

    }
    class InvoicePrinter{
        public void printInvoice(List<Product>products){
         for(Product p : products){
            System.out.println(p.name + " - "+ p.price);
         }   
        }
    }
}
