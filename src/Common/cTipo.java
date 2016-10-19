/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

public class cTipo {

    //atributos
    Integer id;
    String desc;

    public cTipo() {
    }

    //instanciar objeto
    public cTipo(Integer pId, String pDesc) {
        id = pId;
        desc = pDesc;
    }

    //metodos get y set para el objeto
    public Integer getId() {
        return id;
    }

    public void setId(Integer pId) {
        id = pId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String pDesc) {
        desc = pDesc;
    }
}
