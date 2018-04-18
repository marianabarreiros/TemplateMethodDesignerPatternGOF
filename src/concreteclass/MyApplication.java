/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreteclass;

import abstractclass.Application;

/**
 *
 * @author qt
 */
public class MyApplication extends Application{

    @Override
    public void primitiveOperation1() {
        System.out.println("Primitive Operation 1");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("Primitive Operation 2");
    }
    
}
