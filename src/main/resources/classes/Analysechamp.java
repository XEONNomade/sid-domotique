package classes;
// Generated Dec 16, 2013 11:52:22 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Analysechamp generated by hbm2java
 */
public class Analysechamp  implements java.io.Serializable {


     private Integer idAnalyseChamp;
     private Analyse analyse;
     private Champs champs;
     private Set itemses = new HashSet(0);

    public Analysechamp() {
    }

	
    public Analysechamp(Analyse analyse, Champs champs) {
        this.analyse = analyse;
        this.champs = champs;
    }
    public Analysechamp(Analyse analyse, Champs champs, Set itemses) {
       this.analyse = analyse;
       this.champs = champs;
       this.itemses = itemses;
    }
   
    public Integer getIdAnalyseChamp() {
        return this.idAnalyseChamp;
    }
    
    public void setIdAnalyseChamp(Integer idAnalyseChamp) {
        this.idAnalyseChamp = idAnalyseChamp;
    }
    public Analyse getAnalyse() {
        return this.analyse;
    }
    
    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }
    public Champs getChamps() {
        return this.champs;
    }
    
    public void setChamps(Champs champs) {
        this.champs = champs;
    }
    public Set getItemses() {
        return this.itemses;
    }
    
    public void setItemses(Set itemses) {
        this.itemses = itemses;
    }




}


