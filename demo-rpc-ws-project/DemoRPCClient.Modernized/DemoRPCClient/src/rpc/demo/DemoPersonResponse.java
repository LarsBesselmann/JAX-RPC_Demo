
package rpc.demo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="demoPersonReturn" type="{http://demo.rpc}person"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "demoPersonReturn"
})
@XmlRootElement(name = "demoPersonResponse")
public class DemoPersonResponse {

    @XmlElement(required = true)
    protected Person demoPersonReturn;

    /**
     * Gets the value of the demoPersonReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getDemoPersonReturn() {
        return demoPersonReturn;
    }

    /**
     * Sets the value of the demoPersonReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setDemoPersonReturn(Person value) {
        this.demoPersonReturn = value;
    }

}
