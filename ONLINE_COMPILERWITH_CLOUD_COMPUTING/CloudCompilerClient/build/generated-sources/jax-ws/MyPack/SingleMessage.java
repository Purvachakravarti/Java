
package MyPack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for singleMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="singleMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "singleMessage", propOrder = {
    "msgTo",
    "msgFrom",
    "msgText",
    "mid",
    "dateTime"
})
public class SingleMessage {

    protected String msgTo;
    protected String msgFrom;
    protected String msgText;
    protected int mid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;

    /**
     * Gets the value of the msgTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgTo() {
        return msgTo;
    }

    /**
     * Sets the value of the msgTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgTo(String value) {
        this.msgTo = value;
    }

    /**
     * Gets the value of the msgFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFrom() {
        return msgFrom;
    }

    /**
     * Sets the value of the msgFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFrom(String value) {
        this.msgFrom = value;
    }

    /**
     * Gets the value of the msgText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgText() {
        return msgText;
    }

    /**
     * Sets the value of the msgText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgText(String value) {
        this.msgText = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

}
