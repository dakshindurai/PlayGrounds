package com;

public class UnderstandingThis {
   public int a, b;
   public void setData(int a, int b){
       this.a=a;
       this.b=b;
       System.out.println("SetData is getting called :::");
   }
   public void viewData(){
       System.out.println("ViewData is getting called :::");
       System.out.println("The Value of A is : "+ a);
       System.out.println("The Value of B is "+ b);
   }
   public static void main (String[] args){
       UnderstandingThis obj1 = new UnderstandingThis();
       obj1.setData(2,4);
       obj1.viewData();
       UnderstandingThis obj2 = new UnderstandingThis();
       obj2.setData(6,8);
       obj2.viewData();

   }
}
