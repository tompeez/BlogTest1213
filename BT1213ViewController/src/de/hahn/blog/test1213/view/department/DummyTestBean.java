package de.hahn.blog.test1213.view.department;

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
}
