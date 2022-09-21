/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsoccerevent;

import java.util.EventObject;
/**
 *
 * @author Zucrem
 */
public class ScoreEvent extends EventObject {
    
    private String somedata;
    public ScoreEvent(Object source,String val) {
        super(source);
        somedata = val;
    }

    public String getSomedata() {
        return somedata;
    }     
}
