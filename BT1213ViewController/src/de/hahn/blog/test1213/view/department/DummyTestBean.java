package de.hahn.blog.test1213.view.department;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import org.apache.myfaces.trinidad.util.ComponentReference;

public class DummyTestBean {
    private ComponentReference name;

    public DummyTestBean() {
    }

    public String b1_action() {
        // Add event code here...
        return null;
    }

    public void setName(RichInputText name) {
        this.name = ComponentReference.newUIComponentReference(name);
    }


    public RichInputText getName() {
        RichInputText comp = null;
        if (this.name != null) {
            comp = (RichInputText) name.getComponent();
        }
        return comp;
    }

    public void myDummyListener(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        UIComponent ui = (UIComponent) object;
        String id = ui.getId();
        // Add event code here...
    }
}
