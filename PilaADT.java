/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialedfebrero2016;

/**
 *
 * @author SG
 * @param <T>
 */
public interface PilaADT<T>{
    public T pop();
    public void push (T push);
    public boolean isEmpty();
    public T peek();    
}
