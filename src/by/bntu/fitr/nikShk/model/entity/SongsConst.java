/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author niksk
 */
public class SongsConst {
    private static ResourceBundle bundle;
    
    
    static {
//        Locale l = new Locale("BY", "be");
        Locale l = new Locale("RU", "ru");
//        Locale l = new Locale("GB", "en");
        
        bundle = ResourceBundle.getBundle("by.bntu.fitr.nikShk.l10n.Locale", l);
    }
    public static final String AUDIO = bundle.getString("audio");
    public static final String TYPE = bundle.getString("type");
    public static final String TIME = bundle.getString("time");
    public static final String SEC = bundle.getString("sec");
    public static final String QNT = bundle.getString("qnt");
    public static final String SONG = bundle.getString("song");
     public static final String AUDIOLIST = bundle.getString("audiolist");
      public static final String BOX = bundle.getString("box");
    
    public static final String CLASSIC = bundle.getString("classic");
    public static final String VIOLINE = bundle.getString("violine");
    public static final String PIANO = bundle.getString("piano");
    
    public static final String ROCK = bundle.getString("rock");
    public static final String GITARS = bundle.getString("gitars");
    public static final String DRUMBUM = bundle.getString("brumbum");
    
    public static final String RAP = bundle.getString("rap");
    public static final String BITBOXER = bundle.getString("bitboxer");
    
    public static final String REMIX = bundle.getString("remix");
    
    

}
