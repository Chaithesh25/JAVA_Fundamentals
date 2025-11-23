enum product{
    mobile(50000),Laptop(70000),television(90000);

    private  int price;

    private  product(int price){
          this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;

    }
}


class enum1{

    public static void main(String[] args) {
        product[] productObj = product.values();

        // productObj.setPrice();
        
        // System.out.println(productObj+":"+productObj.getprice());


        for (var elements : productObj) {
             
            System.out.println(elements+":"+elements.getprice());
        }  
    }
}