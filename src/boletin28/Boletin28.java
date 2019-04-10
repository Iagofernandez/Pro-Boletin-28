/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       C1 obj1 = new C1();
       C2 obj2 = new C2();
       C3 obj3 = new C3();
       C4 obj4 = new C4();
       
        System.out.println("obj1.test = "+ obj1.test());
        //retorna 1
         System.out.println("obj1.result1 = " + obj1.result1());
         //retorna 1
          System.out.println("obj2.test = "+obj2.test());
          //retorna 2
             System.out.println("obj2.result1 = "+obj3.result1());
//retorna 2

        System.out.println("obj3.test = " +obj3.test());
//retorna 2

        System.out.println("obj4.result1 = "+obj4.result1());
//retorna 4
        System.out.println("obj3.result2 = " +obj3.result2());
//retorna 2

        System.out.println("obj4.result2 = " +obj4.result2());
//retorna 4

        System.out.println("obj3.result3 = " +obj3.result3());

//retorna 2
        System.out.println("obj4.result3 = " +obj4.result3());
//retorna 2
    }
    
}
