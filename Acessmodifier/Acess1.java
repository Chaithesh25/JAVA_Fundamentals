package Acessmodifier;

import ParentPackage.Parent;

class child extends Parent {

    public void show(){

        System.out.println(variable);
    }

}



class Acess1{

    public static void main(String[] args){

        child obj = new child();
        obj.show();

    }
}