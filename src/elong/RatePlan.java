//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.26 at 02:14:30 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlan">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseRatePlan">
 *       &lt;sequence>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{}EnumGuestTypeCode"/>
 *         &lt;element name="ProductTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLimitTimeSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAdvHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxAdvHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GuaranteeRules" type="{}ArrayOfBaseGuaranteeRule" minOccurs="0"/>
 *         &lt;element name="PrepayRules" type="{}ArrayOfBasePrepayRule" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{}ArrayOfBaseValueAddRule" minOccurs="0"/>
 *         &lt;element name="DrrRules" type="{}ArrayOfBaseDrrRule" minOccurs="0"/>
 *         &lt;element name="Coupon" type="{}Coupon" minOccurs="0"/>
 *         &lt;element name="Gifts" type="{}ArrayOfGiftForRP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlan", propOrder = {
    "hotelCode",
    "roomTypeIds",
    "customerType",
    "productTypes",
    "isLimitTimeSale",
    "startTime",
    "endTime",
    "minAdvHours",
    "maxAdvHours",
    "guaranteeRules",
    "prepayRules",
    "valueAdds",
    "drrRules",
    "coupon",
    "gifts"
})
public class RatePlan
    extends BaseRatePlan
{

    @JSONField(name = "HotelCode")
    protected String hotelCode;
    @JSONField(name = "RoomTypeIds")
    protected String roomTypeIds;
    @JSONField(name = "CustomerType")
    protected EnumGuestTypeCode customerType;
    @JSONField(name = "ProductTypes")
    protected String productTypes;
    @JSONField(name = "IsLimitTimeSale")
    protected Boolean isLimitTimeSale;
    @JSONField(name = "StartTime")
    protected String startTime;
    @JSONField(name = "EndTime")
    protected String endTime;
    @JSONField(name = "MinAdvHours")
    protected int minAdvHours;
    @JSONField(name = "MaxAdvHours")
    protected int maxAdvHours;
    @JSONField(name = "GuaranteeRules")
    protected List<BaseGuaranteeRule> guaranteeRules;
    @JSONField(name = "PrepayRules")
    protected List<BasePrepayRule> prepayRules;
    @JSONField(name = "ValueAdds")
    protected List<BaseValueAddRule> valueAdds;
    @JSONField(name = "DrrRules")
    protected List<BaseDrrRule> drrRules;
    @JSONField(name = "Coupon")
    protected Coupon coupon;
    @JSONField(name = "Gifts")
    protected List<GiftForRP> gifts;

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the roomTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeIds() {
        return roomTypeIds;
    }

    /**
     * Sets the value of the roomTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeIds(String value) {
        this.roomTypeIds = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public EnumGuestTypeCode getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumGuestTypeCode }
     *     
     */
    public void setCustomerType(EnumGuestTypeCode value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the productTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypes() {
        return productTypes;
    }

    /**
     * Sets the value of the productTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypes(String value) {
        this.productTypes = value;
    }

    /**
     * Gets the value of the isLimitTimeSale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLimitTimeSale() {
        return isLimitTimeSale;
    }

    /**
     * Sets the value of the isLimitTimeSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLimitTimeSale(Boolean value) {
        this.isLimitTimeSale = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the minAdvHours property.
     * 
     */
    public int getMinAdvHours() {
        return minAdvHours;
    }

    /**
     * Sets the value of the minAdvHours property.
     * 
     */
    public void setMinAdvHours(int value) {
        this.minAdvHours = value;
    }

    /**
     * Gets the value of the maxAdvHours property.
     * 
     */
    public int getMaxAdvHours() {
        return maxAdvHours;
    }

    /**
     * Sets the value of the maxAdvHours property.
     * 
     */
    public void setMaxAdvHours(int value) {
        this.maxAdvHours = value;
    }

    /**
     * Gets the value of the guaranteeRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BaseGuaranteeRule> }
     *     
     */
    public List<BaseGuaranteeRule> getGuaranteeRules() {
        return guaranteeRules;
    }

    /**
     * Sets the value of the guaranteeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BaseGuaranteeRule> }
     *     
     */
    public void setGuaranteeRules(List<BaseGuaranteeRule> value) {
        this.guaranteeRules = value;
    }

    /**
     * Gets the value of the prepayRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BasePrepayRule> }
     *     
     */
    public List<BasePrepayRule> getPrepayRules() {
        return prepayRules;
    }

    /**
     * Sets the value of the prepayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BasePrepayRule> }
     *     
     */
    public void setPrepayRules(List<BasePrepayRule> value) {
        this.prepayRules = value;
    }

    /**
     * Gets the value of the valueAdds property.
     * 
     * @return
     *     possible object is
     *     {@link List<BaseValueAddRule> }
     *     
     */
    public List<BaseValueAddRule> getValueAdds() {
        return valueAdds;
    }

    /**
     * Sets the value of the valueAdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BaseValueAddRule> }
     *     
     */
    public void setValueAdds(List<BaseValueAddRule> value) {
        this.valueAdds = value;
    }

    /**
     * Gets the value of the drrRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BaseDrrRule> }
     *     
     */
    public List<BaseDrrRule> getDrrRules() {
        return drrRules;
    }

    /**
     * Sets the value of the drrRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BaseDrrRule> }
     *     
     */
    public void setDrrRules(List<BaseDrrRule> value) {
        this.drrRules = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link Coupon }
     *     
     */
    public Coupon getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon }
     *     
     */
    public void setCoupon(Coupon value) {
        this.coupon = value;
    }

    /**
     * Gets the value of the gifts property.
     * 
     * @return
     *     possible object is
     *     {@link List<GiftForRP> }
     *     
     */
    public List<GiftForRP> getGifts() {
        return gifts;
    }

    /**
     * Sets the value of the gifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<GiftForRP> }
     *     
     */
    public void setGifts(List<GiftForRP> value) {
        this.gifts = value;
    }

}
