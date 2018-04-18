/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author qt
 */
public abstract class Application {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
    
    
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}
