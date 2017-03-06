/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author BANK
 */

public class NameRepository implements Container{

    public String names[] = {};
     public Iterator getIterator() {return null;}
      private class NameIterator implements Iterator {

        @Override
        public boolean hasnext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public object next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
      }


    
}

   
