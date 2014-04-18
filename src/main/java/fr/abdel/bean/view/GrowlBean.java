package fr.abdel.bean.view;

import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
/**
 * Created by Abdeslem on 17/04/14.
 */
@Stateless
public class GrowlBean implements Serializable {

    private String text;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public void save(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage("Successful", "Hello " + text));
        context.addMessage(null, new FacesMessage("Second Message", "Additional Info Here..."));
    }
}
