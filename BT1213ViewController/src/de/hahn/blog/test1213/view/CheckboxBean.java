package de.hahn.blog.test1213.view;

import java.util.Properties;

import javax.faces.event.ActionEvent;

import oracle.adf.share.logging.ADFLogger;


public class CheckboxBean {
    private static ADFLogger _logger = ADFLogger.createADFLogger(CheckboxBean.class);
    Boolean myCheckBoxValue;
    Properties properties = null;

    public void setMyCheckBoxValue(Boolean myCheckBoxValue) {
        this.myCheckBoxValue = myCheckBoxValue;
    }

    public Boolean getMyCheckBoxValue() {

        // if hte value is null setthe value from the properties
        if (myCheckBoxValue == null) {
            // layz init the properties: if they are not already read read them
            if (properties == null) {
                _logger.info("Init properties!");
                init();
            }
            String val = properties.getProperty("CheckStatus");
            myCheckBoxValue = (val.equals("TRUE") ? Boolean.TRUE : Boolean.FALSE);
            _logger.info("Set Value to " + val + " from properities!");
        }
        return myCheckBoxValue;
    }

    public CheckboxBean() {
    }

    private void init() {
        // read the data from the property file
        // here I'm just setting one property
        properties = new Properties();
        properties.put("CheckStatus", "TRUE");
    }

    public void clearCheckBoxValue(ActionEvent actionEvent) {
        myCheckBoxValue = null;
    }
}
