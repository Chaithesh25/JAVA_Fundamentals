
import java.util.Objects;

class A{

    String name;
    int price;

    public void showDetails(){
         
        System.out.println("Price: "+price+"name: "+name);

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final A other = (A) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
}


class cal{
    public static void main(String[] args) {

        A obj = new A();
        obj.name ="Lenovo Loq";
        obj.price = 12000;

        // System.out.println(obj.equals());
        
    }
}